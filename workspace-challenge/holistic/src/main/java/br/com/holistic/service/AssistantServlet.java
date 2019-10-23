package br.com.holistic.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.ibm.cloud.sdk.core.service.security.IamOptions;
import com.ibm.watson.assistant.v2.Assistant;
import com.ibm.watson.assistant.v2.model.CreateSessionOptions;
import com.ibm.watson.assistant.v2.model.MessageContext;
import com.ibm.watson.assistant.v2.model.MessageInput;
import com.ibm.watson.assistant.v2.model.MessageInputOptions;
import com.ibm.watson.assistant.v2.model.MessageOptions;
import com.ibm.watson.assistant.v2.model.MessageResponse;
import com.ibm.watson.assistant.v2.model.SessionResponse;

/**
 * Classe Responsavel por fazer a comunicaÃ§Ã£o com o IBM Watson Assistant
 * @author Equipe Holistic
 * @version 00.001
 * @see br.com.holistic.service
 */
@WebServlet(urlPatterns = "/assistant")
public class AssistantServlet extends HttpServlet{

	private MessageContext context = new MessageContext();
	private static final long serialVersionUID = 9052436307776407283L;
	
	/**
	 * Este metodo envia uma requisicao POST para a api do watson assistant
	 * @param objeto HttpServletRequest req, HttpServletResponse resp
	 * @return void
	 * @throws ServletException, IOException
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String msg = req.getParameter("question");
		System.out.println(msg);
		
		MessageResponse response = this.assistantAPICall(msg);
		
		resp.setContentType("application/json");
		resp.getWriter().write(new Gson().toJson(response.getOutput().getGeneric()));
	
	}

	/**
	 * Este metodo credencia a conexao com o watson assistant
	 * @param String msg
	 * @return MessageResponse
	 * @throws ServletException, IOException
	 */
	private MessageResponse assistantAPICall(String msg) {
		
		// Configuração de autenticação do serviço
		IamOptions options = new IamOptions.Builder()
				.apiKey("BJYJDsnxKEYY3C3Vj02PVM_SMw_viw0Bse5jej_1Ynu_")
				.build();
		// Criando o objeto do serviço desejado
		Assistant service = new Assistant("2019-02-28", options);
		String assistantId = "95cd6319-eb73-41c5-b543-a46a499003ec";
		
		//  Criando minha sessão
		CreateSessionOptions sessionOptions = new CreateSessionOptions.Builder()
				.assistantId(assistantId)
				.build();
		SessionResponse session = service.createSession(sessionOptions)
				.execute()
				.getResult();
		String sessionId = session.getSessionId();
		
		// Definindo retorno do contexto
		MessageInputOptions inputOptions = new MessageInputOptions();
		inputOptions.setReturnContext(true);
		
		// Iniciando a Conversa com Washington
		MessageInput input = new MessageInput.Builder()
				.text(msg)
				.options(inputOptions)
				.build();
		
		MessageOptions optionsMessage = new MessageOptions.Builder()
				.assistantId(assistantId)
				.sessionId(sessionId)
				.input(input)
				.context(this.context)
				.build();
		
		MessageResponse response = service.message(optionsMessage)
				.execute()
				.getResult();
		
		this.context = response.getContext();
		
		return response;
	}

}







