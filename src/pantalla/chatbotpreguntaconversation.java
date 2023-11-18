
package pantalla;

/**
 *
 * @author abel
 */
import Vista.Login;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class chatbotpreguntaconversation extends JFrame {

    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;
    private JButton backButton; // Botón para volver a la ventana anterior

    // Mapa que almacena las conversaciones por nombre de usuario
    private Map<String, List<String>> conversations = new HashMap<>();

    public chatbotpreguntaconversation() {
        setTitle("BOTON AYUDA ");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        chatArea = new JTextArea();
        chatArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(chatArea);

        inputField = new JTextField(30);

        sendButton = new JButton("Enviar");
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });

        backButton = new JButton("Volver"); // Crea el botón "Volver"
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login k = new Login();
                k.setVisible(true);
                dispose();
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(inputField, BorderLayout.CENTER);
        panel.add(sendButton, BorderLayout.EAST);
        panel.add(backButton, BorderLayout.WEST); // Agrega el botón "Volver" a la izquierda

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(panel, BorderLayout.SOUTH);
    }

    // metodo su proposito es enviar mensaje o puede variar segun lo que le pidan
    private void sendMessage() {
        String userMessage = inputField.getText();
        chatArea.append("Tú: " + userMessage + "\n");
        inputField.setText("");

        String currentUsername = "Usuario1";

        // Obtener la conversación actual del mapa o crear una nueva
        List<String> conversation = conversations.get(currentUsername);
        if (conversation == null) {
            conversation = new ArrayList<>();
            conversations.put(currentUsername, conversation);
        }

        // Agregar el mensaje del usuario a la conversación
        conversation.add("Tú: " + userMessage);

        // Realizar acciones basadas en el mensaje del usuario
        handleUserMessage(userMessage, conversation);

        // Mostrar la conversación en el chat
        updateChatArea(conversation);
    }

    // este metodo nos permite manejar  un mensaje de usuario en el contexto de una conversacion
    // por ejemplo responderle a un usuario
    private void handleUserMessage(String userMessage, List<String> conversation) {

        String response = "";

        if (userMessage.toLowerCase().contains("buscame base de dato")) {
            String searchTerm = userMessage.toLowerCase().replace("buscame base de dato", "").trim();
            response = "Buscando en YouTube: " + searchTerm;
            openWebsite("https://www.youtube.com/watch?v=gHXQ9rhM-Q4&t=491s=" + searchTerm);
        } else if (userMessage.toLowerCase().contains("buscame grafico")) {
            String searchTerm = userMessage.toLowerCase().replace("buscame grafico", "").trim();
            response = "Buscando en YouTube (gráfico): " + searchTerm;
            openWebsite("https://www.youtube.com/watch?v=cFfbqUEOkw8&t=695s=" + searchTerm);

        } else if (userMessage.toLowerCase().contains("buscame grafico")) {
            String searchTerm = userMessage.toLowerCase().replace("buscame lineas", "").trim();
            response = " buscame las lineas de codigo " + searchTerm;
            openWebsite("https://www.youtube.com/watch?v=cFfbqUEOkw8&t=695s=" + searchTerm);

        } else if (userMessage.toLowerCase().contains("celular")) {

            response = "Mi número de celular es 3218344569";
        } else if (userMessage.toLowerCase().contains("nombre del auto")) {

            response = "El nombre de mi auto es [luis abel herrera,yeisel, carlos ortiz].";
        } else if (userMessage.toLowerCase().contains("correo electronico")) {

            response = "luisabel_26@gmail.com";
        } else if (userMessage.toLowerCase().contains("como creo una clave")) {

            response = "El Rector junto al administrador son "
                    + "los unicos que te pueden proporcionar una clave";

        } else {

            response = generateRandomResponse();
        }

        // Añadir el mensaje del usuario a la conversación
        conversation.add("ChatBot: " + response);
    }

    // este metodo nos permite generar respuestas aleatorias
    private String generateRandomResponse() {

        String[] responses = {
            "puedes preguntarme ",
            "como creo una clave",
            "celular",
            "nombre del autor",
            "correo electrónico",
            "buscame base de dato",
            "buscame grafico",
            "buscame linea ",};

        // Creamos una cadena vacía para almacenar las respuestas concatenadas
        StringBuilder todasLasRespuestas = new StringBuilder();

        // Recorremos el arreglo y concatenamos cada elemento con una nueva línea
        for (String respuesta : responses) {
            todasLasRespuestas.append(respuesta).append("\n");
        }

        // Devolvemos todas las respuestas juntas
        return todasLasRespuestas.toString();
    }

    private void updateChatArea(List<String> conversation) {
        // Limpiar el área de chat
        chatArea.setText("");

        //  // Recorrer la conversación y agregar cada mensaje al área de chat.
        for (String message : conversation) {
            // agrega el chat y un salto de linea
            chatArea.append(message + "\n");
        }
    }

// este metodo nos permite abrir un sitio web mediante una url o abrir algo relacionado con una url
    private void openWebsite(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
