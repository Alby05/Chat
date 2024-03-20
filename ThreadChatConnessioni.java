import java.net.*;
import java.io.*;

public class ThreadChatConnessioni implements Runnable
  {
    private ThreadGestioneServizioChat gestoreChat;
    private socket client = null;
    private BufferedReader input = null;
    private PrintWriter output = null;
    Thread me;

    public ThreadChatConnessioni(ThreadGestioneServizioChat gestoreChat, Socket client)
    {
      this.gestoreChat = gestoreChat;
      this.client = client;
      try
        {
          this.input = new BufferedReader(new InputStreamReader(client.getInputStream()));
          this.output = new PrintWriter(this.client.getOutputStream().true);
        }catch(Exception e){
          output.println("Errore nella lettura.");
        }
      me = new Thread(this);
      me.start();
    }


    public void run()
    {
      //aspetto le ricezioni di messaggi e aggiungo i messaggi alla lista
      while(true){
        try{
          String mex=null;
          while((mex = input.readLine())==null)
            {}
          lista.add(mex);
          lista.select(lista.getItemCount()-1);
        }catch(Exception e){

        }
      }
    }

  public void spedisciMessaggiChat(String messaggio){ 
