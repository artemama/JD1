/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 

package es4f;

/*
 * DesktopDemo.java
 *
 */

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;


public class DesktopDemo extends JFrame {
    
    JButton btnLaunchApplication = new JButton("Launch Application");
    JButton btnLaunchBrowser = new JButton("Launch Browser");
    JButton btnLaunchEmail = new JButton();
    JRadioButton rbEdit = new JRadioButton("Edit");
    JRadioButton rbOpen = new JRadioButton("Open", true);
    JRadioButton rbPrint = new JRadioButton("Print");
    JTextField txtBrowserURI = new JTextField();
    JTextField txtMailTo = new JTextField();
    JTextField txtFile = new JTextField();
    ButtonGroup bgAppAction = new ButtonGroup();
    JLabel lblMailRecipient = new JLabel("E-mail:");
    JLabel lblBrowserUri = new JLabel("URI:");
    JLabel lblFile = new JLabel("File:");
    JButton btnFile = new JButton("...");
    JLabel emptyLabel = new JLabel(" ");
    JPanel conLeft = new JPanel();
    JPanel conCenter = new JPanel();
    JPanel conRight = new JPanel();
    JFileChooser fc = new JFileChooser();
    File file;
    
    private Desktop desktop;
    private Desktop.Action action = Desktop.Action.OPEN;
    
    
    /**
     * Creates new form DesktopDemo
     */
    public DesktopDemo() {
        // init all gui components
        initComponents();
        // disable buttons that launch browser, email client,
        // disable buttons that open, edit, print files
        disableActions();
        // before any Desktop APIs are used, first check whether the API is
        // supported by this particular VM on this particular host
        if (Desktop.isDesktopSupported()) {
            desktop = Desktop.getDesktop();
            // now enable buttons for actions that are supported.
            enableSupportedActions();
        }
<<<<<<< HEAD
      /*  loadFrameIcon();*/
        setResizable(false);
    }
    
=======
        loadFrameIcon();
        setResizable(false);
    }
     
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
    public static void main(String args[]) {
        /* Use an appropriate Look and Feel */
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DesktopDemo().setVisible(true);
            }
        });
    }
<<<<<<< HEAD
    
    /** Create and show components
     */
    private void initComponents() {
        
=======
     
    /** Create and show components
     */
    private void initComponents() {
         
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("DesktopDemo");
        txtBrowserURI.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onLaunchBrowser(null);
            }
        });
<<<<<<< HEAD
        
=======
         
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
        btnLaunchBrowser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                onLaunchBrowser(evt);
            }
        });
<<<<<<< HEAD
        
        
=======
         
         
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
        txtMailTo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onLaunchMail(null);
            }
        });
<<<<<<< HEAD
        
=======
         
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
        btnLaunchEmail.setText("Launch Mail");
        btnLaunchEmail.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                onLaunchMail(evt);
            }
        });
<<<<<<< HEAD
        
        
=======
         
         
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
        txtFile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onLaunchDefaultApplication(null);
            }
        });
<<<<<<< HEAD
        
=======
         
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
        rbOpen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                onOpenAction(evt);
            }
        });
<<<<<<< HEAD
        
        
=======
         
         
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
        rbEdit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                onEditAction(evt);
            }
        });
<<<<<<< HEAD
        
        
=======
         
         
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
        rbPrint.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                onPrintAction(evt);
            }
        });
<<<<<<< HEAD
        
=======
         
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
        btnLaunchApplication.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                onLaunchDefaultApplication(evt);
            }
        });
<<<<<<< HEAD
        
=======
         
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
        btnFile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                onChooseFile(evt);
            }
        });
<<<<<<< HEAD
        
        Container conFrame = this.getContentPane();
        
        bgAppAction.add(rbOpen);
        bgAppAction.add(rbEdit);
        bgAppAction.add(rbPrint);
        
        // Components layouting
        
=======
         
        Container conFrame = this.getContentPane();
         
        bgAppAction.add(rbOpen);
        bgAppAction.add(rbEdit);
        bgAppAction.add(rbPrint);
         
        // Components layouting
         
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
        GroupLayout layout = new GroupLayout(conFrame);
        conFrame.setLayout(layout);
        layout.setAutoCreateContainerGaps(true);
        layout.setAutoCreateGaps(true);
<<<<<<< HEAD
        
        GroupLayout.SequentialGroup majorHGroup = layout.createSequentialGroup();
        
        // Horizontal group
        
=======
         
        GroupLayout.SequentialGroup majorHGroup = layout.createSequentialGroup();
         
        // Horizontal group
         
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
        GroupLayout.ParallelGroup lblHGroup =
                layout.createParallelGroup(GroupLayout.Alignment.LEADING);
        lblHGroup.addComponent(lblBrowserUri, GroupLayout.Alignment.TRAILING);
        lblHGroup.addComponent(lblMailRecipient, GroupLayout.Alignment.TRAILING);
        lblHGroup.addComponent(lblFile, GroupLayout.Alignment.TRAILING);
<<<<<<< HEAD
        
=======
         
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
        GroupLayout.ParallelGroup txtFieldsHGroup =
                layout.createParallelGroup(GroupLayout.Alignment.LEADING);
        txtFieldsHGroup.addComponent(txtMailTo);
        txtFieldsHGroup.addComponent(txtBrowserURI);
        GroupLayout.SequentialGroup rbHGroup = layout.createSequentialGroup();
        rbHGroup.addComponent(rbOpen);
        rbHGroup.addComponent(rbEdit);
        rbHGroup.addComponent(rbPrint);
        txtFieldsHGroup.addGroup(rbHGroup);
        GroupLayout.SequentialGroup fileHGroup = layout.createSequentialGroup();
        fileHGroup.addComponent(txtFile);
        fileHGroup.addComponent(btnFile);
        txtFieldsHGroup.addGroup(fileHGroup);
<<<<<<< HEAD
        
=======
         
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
        GroupLayout.ParallelGroup btnHGroup =
                layout.createParallelGroup(GroupLayout.Alignment.LEADING);
        btnHGroup.addComponent(btnLaunchBrowser);
        btnHGroup.addComponent(btnLaunchEmail);
        btnHGroup.addComponent(btnLaunchApplication);
<<<<<<< HEAD
        
        majorHGroup.addGroup(lblHGroup);
        majorHGroup.addGroup(txtFieldsHGroup);
        majorHGroup.addGroup(btnHGroup);
        
        layout.setHorizontalGroup(majorHGroup);
        
        // Vertical group
        
        GroupLayout.SequentialGroup majorVGroup = layout.createSequentialGroup();
        
=======
         
        majorHGroup.addGroup(lblHGroup);
        majorHGroup.addGroup(txtFieldsHGroup);
        majorHGroup.addGroup(btnHGroup);
         
        layout.setHorizontalGroup(majorHGroup);
         
        // Vertical group
         
        GroupLayout.SequentialGroup majorVGroup = layout.createSequentialGroup();
         
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
        GroupLayout.ParallelGroup uriVGroup =
                layout.createParallelGroup(GroupLayout.Alignment.BASELINE);
        uriVGroup.addComponent(lblBrowserUri);
        uriVGroup.addComponent(txtBrowserURI);
        uriVGroup.addComponent(btnLaunchBrowser);
<<<<<<< HEAD
        
=======
         
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
        GroupLayout.ParallelGroup mailVGroup =
                layout.createParallelGroup(GroupLayout.Alignment.BASELINE);
        mailVGroup.addComponent(lblMailRecipient);
        mailVGroup.addComponent(txtMailTo);
        mailVGroup.addComponent(btnLaunchEmail);
<<<<<<< HEAD
        
=======
         
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
        GroupLayout.ParallelGroup rbVGroup =
                layout.createParallelGroup(GroupLayout.Alignment.BASELINE);
        rbVGroup.addComponent(rbOpen);
        rbVGroup.addComponent(rbEdit);
        rbVGroup.addComponent(rbPrint);
<<<<<<< HEAD
        
=======
         
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
        GroupLayout.ParallelGroup fileVGroup =
                layout.createParallelGroup(GroupLayout.Alignment.BASELINE);
        fileVGroup.addComponent(lblFile);
        fileVGroup.addComponent(btnLaunchApplication);
        fileVGroup.addComponent(txtFile);
        fileVGroup.addComponent(btnFile);
<<<<<<< HEAD
        
=======
         
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
        majorVGroup.addGroup(uriVGroup);
        majorVGroup.addGroup(mailVGroup);
        majorVGroup.addGroup(rbVGroup);
        majorVGroup.addGroup(fileVGroup);
<<<<<<< HEAD
        
        layout.setVerticalGroup(majorVGroup);
        
        pack();
    }
    
    /**
     * Load the "desktop" icon into our frame window.
     */
   /* private void loadFrameIcon() {
        URL imgUrl = null;
        ImageIcon imgIcon = null;
        
=======
         
        layout.setVerticalGroup(majorVGroup);
         
        pack();
    }
     
    /**
     * Load the "desktop" icon into our frame window.
     */
    private void loadFrameIcon() {
        URL imgUrl = null;
        ImageIcon imgIcon = null;
         
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
        imgUrl = DesktopDemo.class.getResource("images/desk32.gif");
        imgIcon = new ImageIcon(imgUrl);
        Image img = imgIcon.getImage();
        this.setIconImage(img);
<<<<<<< HEAD
    }*/
    
=======
    }
     
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
    /*
     * Set the Desktop.Action to PRINT before invoking
     * the default application.
     */
    private void onPrintAction(ActionEvent evt) {
        action = Desktop.Action.PRINT;
    }
<<<<<<< HEAD
    
=======
     
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
    /**
     * Set the Desktop.Action to EDIT before invoking
     * the default application.
     */
    private void onEditAction(ActionEvent evt) {
        action = Desktop.Action.EDIT;
    }
<<<<<<< HEAD
    
=======
     
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
    /**
     * Set the Desktop.Action to OPEN before invoking
     * the default application.
     */
    private void onOpenAction(ActionEvent evt) {
        action = Desktop.Action.OPEN;
    }
<<<<<<< HEAD
    
=======
     
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
    /**
     * Launch the default application associated with a specific
     * filename using the preset Desktop.Action.
     *
     */
    private void onLaunchDefaultApplication(ActionEvent evt) {
        String fileName = txtFile.getText();
        File file = new File(fileName);
<<<<<<< HEAD
        
=======
         
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
        try {
            switch(action) {
                case OPEN:
                    desktop.open(file);
                    break;
                case EDIT:
                    desktop.edit(file);
                    break;
                case PRINT:
                    desktop.print(file);
                    break;
            }
        } catch (IOException ioe) {
            //ioe.printStackTrace();
            System.out.println("Cannot perform the given operation to the " + file + " file");
        }
    }
<<<<<<< HEAD
    
=======
     
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
    /**
     * Launch the default email client using the "mailto"
     * protocol and the text supplied by the user.
     *
     */
    private void onLaunchMail(ActionEvent evt) {
        String mailTo = txtMailTo.getText();
        URI uriMailTo = null;
        try {
            if (mailTo.length() > 0) {
                uriMailTo = new URI("mailto", mailTo, null);
                desktop.mail(uriMailTo);
            } else {
                desktop.mail();
            }
        } catch(IOException ioe) {
            ioe.printStackTrace();
        } catch(URISyntaxException use) {
            use.printStackTrace();
        }
    }
<<<<<<< HEAD
    
=======
     
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
    /**
     * Launch the default browser with the text provided by the
     * user.
     *
     */
    private void onLaunchBrowser(ActionEvent evt) {
        URI uri = null;
        try {
            uri = new URI(txtBrowserURI.getText());
            desktop.browse(uri);
        } catch(IOException ioe) {
            System.out.println("The system cannot find the " + uri + " file specified");
            //ioe.printStackTrace();
        } catch(URISyntaxException use) {
            System.out.println("Illegal character in path");
            //use.printStackTrace();
        }
    }
<<<<<<< HEAD
    
=======
     
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
    private void onChooseFile(ActionEvent evt) {
        if (evt.getSource() == btnFile) {
            int returnVal = fc.showOpenDialog(DesktopDemo.this);
            if (returnVal == JFileChooser.APPROVE_OPTION){
                file = fc.getSelectedFile();
                txtFile.setText(file.getAbsolutePath());
            }
        }
    }
<<<<<<< HEAD
    
=======
     
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
    /**
     * Enable actions that are supported on this host.
     * The actions are: open browser, open email client, and
     * open, edit, and print files using their associated application
     */
<<<<<<< HEAD
    
=======
     
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
    private void enableSupportedActions() {
        if (desktop.isSupported(Desktop.Action.BROWSE)) {
            txtBrowserURI.setEnabled(true);
            btnLaunchBrowser.setEnabled(true);
        }
        if (desktop.isSupported(Desktop.Action.MAIL)) {
            txtMailTo.setEnabled(true);
            btnLaunchEmail.setEnabled(true);
        }
        if (desktop.isSupported(Desktop.Action.OPEN)) {
            rbOpen.setEnabled(true);
        }
        if (desktop.isSupported(Desktop.Action.EDIT)) {
            rbEdit.setEnabled(true);
        }
        if (desktop.isSupported(Desktop.Action.PRINT)) {
            rbPrint.setEnabled(true);
        }
        if (rbEdit.isEnabled() || rbOpen.isEnabled() || rbPrint.isEnabled()) {
            txtFile.setEnabled(true);
            btnLaunchApplication.setEnabled(true);
            btnFile.setEnabled(true);
        }
    }
<<<<<<< HEAD
    
=======
     
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
    /**
     * Disable all graphical components until we know
     * whether their functionality is supported.
     */
    private void disableActions() {
        txtBrowserURI.setEnabled(false);
        btnLaunchBrowser.setEnabled(false);
<<<<<<< HEAD
        
        txtMailTo.setEnabled(false);
        btnLaunchEmail.setEnabled(false);
        
        rbEdit.setEnabled(false);
        rbOpen.setEnabled(false);
        rbPrint.setEnabled(false);
        
=======
         
        txtMailTo.setEnabled(false);
        btnLaunchEmail.setEnabled(false);
         
        rbEdit.setEnabled(false);
        rbOpen.setEnabled(false);
        rbPrint.setEnabled(false);
         
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
        txtFile.setEnabled(false);
        btnLaunchApplication.setEnabled(false);
        btnFile.setEnabled(false);
    }
}
<<<<<<< HEAD

=======
>>>>>>> 217e7fe4d6d8ebc1965789b03c25e32eca470a2b
