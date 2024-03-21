public class ChatServer extends JFrame
  {
    public ChatServer()
    {
      super("Chat Server");
      this.setSize(new Dimension(500,300));
      this.setLocationRelativeTo(null);
      this.setEnabled(true);
      this.setBackground(Color.blue);

      PannelloChatServer pan = new PannelloChatServer();
      this.getContentPane().add(pan);
      this.setVisible(true);
    }
  }

  public  PannelloChatServer()
  {
    super();
    this.setBackground(new Color(50, 100, 255));

    JPanel panLista = new List();
    panLista.setBackground(Color.lightGray);
    lista.setSize(100,50);
    lista.setVisible(true);

    JLabel chat1 = new JLabel(" Chat ", JLabel.CENTER);
    chat1.setForeground(new Color(200, 100, 100));
    JLabel chat2 = new JLabel(" Chat ", JLabel.CENTER);
    chat2.setForeground(new Color(200, 100, 100));

    panLista.add(chat1,BorderLayout.WEST);
    panLista.add(chat1,BorderLayout.CENTER);
    panLista.add(chat1,BorderLayout.EAST);


    JPanel nuovoMex = new JPanel(new BorderLayout(20,5));
    nuoboMex.setBackground(new Color(50,100,255));

    JLabel labNuovo = new JLabel("Nuovo Messaggio = " ,JLabel.CENTER);
    labNuovo.setForeground(new Color(255,255,0));

    textNuovo = new JTextField("");

    JButton buttonInvia = new JButton("Invia");
    buttonInvia.addActionListener(this);

    nuovoMex.add(labNuovo, BorderLayout.WEST);
    nuovoMex.add(textNuovo, BorderLayout.CENTER);
    nuovoMex.add(buttonInvia, BorderLayout.EAST);

    this.setLayout(new BorderLayout(0,5));
    add(panLIsta,BorderLayout.CENTER);
    add(nuovoMex,BorderLayout.SOUTH);

    connetti();
  }
