package br.com.holistic.service;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.cloud.sdk.core.service.security.IamOptions;
import com.ibm.watson.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.text_to_speech.v1.model.SynthesizeOptions;
import com.ibm.watson.text_to_speech.v1.util.WaveUtils;

/**
 * A classe realiza o envio do input de texto para o ibm watson assistant, 
 * para a ferramenta TextToSpeech
 * @author Equipe Holistic
 * @version 00.001
 * @see br.com.holistic.service
 */
@WebServlet(urlPatterns = "/tts")
public class TextToSpeechServlet extends HttpServlet {

	private static final long serialVersionUID = 1553566979042668816L;

	/**
	 * Este metodo estabelece a conexao com a api do Watson Assistant, validando a credencial pela apiKey 
	 * Ele sintetiza a voz e linguagem de retorno do IBM Watson TextToSpeech
	 *  
	 * @param objetos HttpServletRequest req, HttpServletResponse resp
	 * @return void
	 * @throws ServletException, IOException
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String msg = req.getParameter("question");
		
		IamOptions options = new IamOptions.Builder()
				// Colocar a sua APIKEY
				.apiKey("BJYJDsnxKEYY3C3Vj02PVM_SMw_viw0Bse5jej_1Ynu_")
				.build();
		
		TextToSpeech service = new TextToSpeech(options);
		
		SynthesizeOptions sOptions = new SynthesizeOptions.Builder()
				.text(msg)
				.accept("audio/wav")
				.voice("pt-BR_IsabelaV3Voice")
				.build();
		
		InputStream is = service.synthesize(sOptions)
				.execute()
				.getResult();
		InputStream in = WaveUtils.reWriteWaveHeader(is);
		
		byte[] buffer = new byte[1024 * 1024];
		try(OutputStream os = resp.getOutputStream()) {
			int length;
			while((length = in.read(buffer)) != -1) {
				os.write(buffer, 0, length);
			}
		}
		
	}
}









