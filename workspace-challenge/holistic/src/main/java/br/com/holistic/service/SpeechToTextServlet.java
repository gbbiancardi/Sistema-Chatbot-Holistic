package br.com.holistic.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.ibm.cloud.sdk.core.http.HttpMediaType;
import com.ibm.cloud.sdk.core.service.security.IamOptions;
import com.ibm.watson.speech_to_text.v1.SpeechToText;
import com.ibm.watson.speech_to_text.v1.model.RecognizeOptions;
import com.ibm.watson.speech_to_text.v1.model.SpeechRecognitionResults;

/**
 * /Classe envia o input de audio criado para o IBM Watson Assistant, 
 * para a ferramenta SpeechToText
 * 
 * @author Equipe Holistic
 * @version 00.001
 * @see br.com.holistic.service
 */
@WebServlet(urlPatterns = "/stt")
public class SpeechToTextServlet extends HttpServlet {

	private static final long serialVersionUID = 7476959821119009111L;

	/**
	 * Este metodo estabelece a conexÃ£o com a aplicacao no Watson Assistant, validando a credencial pela apiKey ,
	 * o mesmo captura o audio do usuario e cria um arquivo .wav, que sintetiza o audio e 
	 * envia para a ferramenta Speech ToText
	 * 
	 * @param objetos HttpServletRequest req, HttpServletResponse resp
	 * @return void
	 * @throws ServletException, IOException
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		byte[] buffer = new byte[1024 * 1024];
		
		InputStream is = req.getInputStream();
		File tempFile = File.createTempFile("speech-", ".wav");
		
		try (FileOutputStream os = new FileOutputStream(tempFile)) {
			int length;
			while((length = is.read(buffer)) != -1) {
				os.write(buffer, 0, length);
			}
		}
		
		IamOptions options = new IamOptions.Builder()
				//Colocar a sua APIKEY
				.apiKey("BJYJDsnxKEYY3C3Vj02PVM_SMw_viw0Bse5jej_1Ynu_")
				.build();
		
		SpeechToText service = new SpeechToText(options);
		
		RecognizeOptions recognizeOptions = new RecognizeOptions.Builder()
				.audio(tempFile)
				.contentType(HttpMediaType.AUDIO_WAV)
				.model("pt-BR_BroadbandModel")
				.build();
		
		SpeechRecognitionResults transcript = service.recognize(recognizeOptions)
				.execute()
				.getResult();
		
		resp.setContentType("application/json");
		resp.getWriter().write(new Gson().toJson(transcript.getResults()));
	
	}
}




