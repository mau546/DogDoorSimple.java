//Esta es una solución al problema de la puerta sin ser orientado a objetos
//Presione el botón en el control remoto y abre la puerta
//Presione el botón nuevamente para cerrar la puerta



import javax.swing.JFrame; //Importamos la clase JFrame de la librería javax.swing para Ventanas
import javax.swing.JButton; //Importamos la clase JButton de la librería javax.swing para Botones
import javax.swing.JTextArea; //Importamos la clase JTextArea de la librería javax.swing para Áreas de Texto
import java.awt.event.ActionListener; //Importamos la clase ActionListener de la librería java.awt.event para escuchar eventos como el click
import java.awt.event.ActionEvent; //Importamos la clase ActionEvent de la librería java.awt.event para manejar eventos cuando ocurren

//En java una interfaz grafíca se compone de botones, etiquetas, campos de texto, etc.
//En este caso se tiene un botón que al presionarlo se abre la puerta y al presionarlo nuevamente se cierra la puerta
//Vamos a crear primero una ventana con un botón que al presionarlo se imprime un mensaje en un TextArea (area de texto)
//Java tiene una clase llamada JFrame que es una ventana que se puede personalizar
//Vamos a crear una clase llamada DogDoorSimple que extienda de JFrame, es decir, queremos que nuestra ventana sea una ventana de Java

public class DogDoorSimple extends JFrame{
    boolean doorOpen = false; //Creamos una variable booleana que indica si la puerta está abierta o cerrada

    //Vamos a crear un constructor, es decir un método que se llama igual que la clase, para nuestra clase DogDoorSimple
    public DogDoorSimple(){
        super("Dog Door Remote");//El constructor de la clase JFrame recibe un String que es el título de la ventana
        setSize(250, 200);//Establecemos el tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Establecemos que al cerrar la ventana se cierre la aplicación
        

        //Creamos un layout, es decir, un diseño para la ventana flowLayout 
        //FlowLayout es un diseño que coloca los componentes uno al lado del otro
        setLayout(new java.awt.BorderLayout());//Establecemos el layout de la ventana
        

        //Creamos un botón
        JButton button = new JButton("Press to open the door");//Creamos un botón con un texto
        add(button, java.awt.BorderLayout.NORTH);//Agregamos el botón a la ventana

        //Vamos a crear un área de texto
        JTextArea textArea = new JTextArea();//Creamos un área de texto vacía
        textArea.setEditable(false);//Establecemos que el área de texto no se pueda editar
        textArea.setText("The door is closed\n");//Establecemos un texto inicial en el área de texto
        add(textArea, java.awt.BorderLayout.CENTER);//Agregamos el área de texto a la ventana
        

        //Vamos a crear un manejador de eventos para el botón
        //Un manejador de eventos es un objeto que se encarga de manejar los eventos que ocurren en un componente
        //En este caso, queremos que cuando se presione el botón se imprima un mensaje en el área de texto
        
        button.addActionListener(new ActionListener(){//Agregamos un manejador de eventos al botón
            public void actionPerformed(ActionEvent e){//Este método se ejecuta cuando se presiona el botón
                if (doorOpen){//Si la puerta está abierta
                    doorOpen = false;//Cerramos la puerta
                    textArea.setText("The door is closed\n");//Imprimimos un mensaje en el área de texto
                    button.setText("Press to open the door");//Cambiamos el texto del botón
                }
                else{//Si la puerta está cerrada
                    doorOpen = true;//Abrimos la puerta
                    textArea.setText("The door is open\n");//Imprimimos un mensaje en el área de texto
                    button.setText("Press to close the door");//Cambiamos el texto del botón
                    }
                }//Fin del creador de eventos ActionListener
            }//Fin del método actionPerformed
    );//Fin del manejador de eventos addActionListener
    
    setVisible(true);//Establecemos que la ventana sea visible
    }//Fin del constructor DogDoorSimple

    //Vamos a crear un método main para probar nuestra ventana
    //Este método main es el punto de entrada de nuestra aplicación
    //Cuando ejecutamos nuestra aplicación, se ejecuta el método main
    //En este caso, al ejecutar nuestra aplicación se crea un objeto de la clase DogDoorSimple
    public static void main(String[] args) {
        new DogDoorSimple(); //Creamos un objeto de la clase DogDoorSimple
    }



    
}
