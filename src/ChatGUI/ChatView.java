/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChatGUI;

import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Kukuh Sanddi
 */
public class ChatView extends javax.swing.JFrame {

    /**
     * Creates new form ChatView
     */
    public ChatView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txAreaChat = new javax.swing.JTextArea();
        txFieldChat = new javax.swing.JTextField();
        btnEnter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txAreaChat.setEditable(false);
        txAreaChat.setColumns(20);
        txAreaChat.setRows(5);
        txAreaChat.setText("Input Server IP Address : ");
        jScrollPane1.setViewportView(txAreaChat);

        btnEnter.setText("Enter");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txFieldChat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnter)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txFieldChat, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public void setTxAreaChat(String message){
        txAreaChat.append(message + "\n");
    }
    
    public Object getTxAreaCHat(){
        return txFieldChat;
    }
    
    public String getStringChat(){
        return txFieldChat.getText();
    }
    
    public void setTxFieldChat (String message){
        this.txFieldChat.setText(message);
    }
    
    public void addListener (ActionListener e){
        txFieldChat.addActionListener(e);
    }
    
     public JButton getBtnEnter() {
         return btnEnter;
     }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txAreaChat;
    private javax.swing.JTextField txFieldChat;
    // End of variables declaration//GEN-END:variables
}