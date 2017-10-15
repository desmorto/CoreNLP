package edu.stanford.nlp.io.ui;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Simple dialog to ask user for url
 *
 * @author Huy Nguyen
 */
public class OpenPageDialog extends javax.swing.JDialog {
  /**
   * 
   */
  private static final long serialVersionUID = -7987625449997527926L;
  public static final int CANCEL_OPTION = 0;
  public static final int APPROVE_OPTION = 1;

  private JFileChooser jfc;
  private int status;

  /**
   * Creates new form OpenPageDialog
   */
  public OpenPageDialog(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    jfc = new JFileChooser();

    addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent we) {
        status = CANCEL_OPTION;
      }
    });
  }

  /**
   * Sets the file chooser used by the Browse button
   */
  public void setFileChooser(JFileChooser jfc) {
    this.jfc = jfc;
  }

  /* return URL in text field of dialog */
  public String getPage() {
    return urlTextField.getText();
  }

  /* returns the status of the dialog (APPROVE_OPTION, CANCEL_OPTION) */
  public int getStatus() {
    return status;
  }

  /* use JFileChooser jfc to browse files */
  private void browseFiles() {
    jfc.setDialogTitle("Open file");
    int status = jfc.showOpenDialog(this);
    if (status == JFileChooser.APPROVE_OPTION) {
      urlTextField.setText(jfc.getSelectedFile().getPath());
      openButton.setEnabled(true);
    }
  }

  private void approve() {
    status = APPROVE_OPTION;
    closeDialog(null);
  }

  /* Enables the open button if the urlTextField is non-empty.  Disables it otherwise */
  private void enableOpenButton() {
    openButton.setEnabled(urlTextField.getText().length() > 0);
  }

  /**
   * This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  private void initComponents()//GEN-BEGIN:initComponents
  {
    jPanel1 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    jPanel3 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    urlTextField = new javax.swing.JTextField();
    jPanel2 = new javax.swing.JPanel();
    openButton = new javax.swing.JButton();
    cancelButton = new javax.swing.JButton();
    browseButton = new javax.swing.JButton();

    addWindowListener(new java.awt.event.WindowAdapter() {
      @Override
      public void windowClosing(java.awt.event.WindowEvent evt) {
        closeDialog(evt);
      }
    });

    jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

    jLabel2.setText("Type in the internet address of a document or web page.");
    jPanel1.add(jLabel2);

    jLabel1.setText("Open");
    jPanel3.add(jLabel1);

    urlTextField.setMinimumSize(new java.awt.Dimension(100, 20));
    urlTextField.setPreferredSize(new java.awt.Dimension(300, 20));
    urlTextField.getDocument().addDocumentListener(new DocumentListener() {
      public void changedUpdate(DocumentEvent e) {
        enableOpenButton();
      }

      public void insertUpdate(DocumentEvent e) {
        enableOpenButton();
      }

      public void removeUpdate(DocumentEvent e) {
        enableOpenButton();
      }
    });
    urlTextField.addActionListener(evt -> urlTextFieldActionPerformed(evt));

    jPanel3.add(urlTextField);

    jPanel1.add(jPanel3);

    getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

    openButton.setText("Open");
    openButton.setEnabled(false);
    openButton.addActionListener(evt -> openButtonActionPerformed(evt));

    jPanel2.add(openButton);

    cancelButton.setText("Cancel");
    cancelButton.addActionListener(evt -> cancelButtonActionPerformed(evt));

    jPanel2.add(cancelButton);

    browseButton.setText("Browse");
    browseButton.addActionListener(evt -> browseButtonActionPerformed(evt));

    jPanel2.add(browseButton);

    getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

    pack();
  }//GEN-END:initComponents

  private void urlTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_urlTextFieldActionPerformed
  {//GEN-HEADEREND:event_urlTextFieldActionPerformed
    if (urlTextField.getText().length() > 0) {
      approve();
    }
  }//GEN-LAST:event_urlTextFieldActionPerformed

  private void browseButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_browseButtonActionPerformed
  {//GEN-HEADEREND:event_browseButtonActionPerformed
    browseFiles();
  }//GEN-LAST:event_browseButtonActionPerformed

  private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancelButtonActionPerformed
  {//GEN-HEADEREND:event_cancelButtonActionPerformed
    status = CANCEL_OPTION;
    closeDialog(null);
  }//GEN-LAST:event_cancelButtonActionPerformed

  private void openButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_openButtonActionPerformed
  {//GEN-HEADEREND:event_openButtonActionPerformed
    approve();
  }//GEN-LAST:event_openButtonActionPerformed

  /**
   * Closes the dialog
   */
  private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
    setVisible(false);
    dispose();
  }//GEN-LAST:event_closeDialog

  /**
   * @param args the command line arguments
   */
  public static void main(String ... args) {
    new OpenPageDialog(new javax.swing.JFrame(), true).setVisible(true);
  }


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField urlTextField;
  private javax.swing.JButton openButton;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JButton cancelButton;
  private javax.swing.JButton browseButton;
  private javax.swing.JPanel jPanel1;
  // End of variables declaration//GEN-END:variables

}
