package project2;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ProductTaken {
JFrame jFrame=new JFrame("Sign Up Form");
    
String product,emailpassword,email;

    JTextField jTextFiledSubjectName=new JTextField();
    
    JTextField jTextFiledSubjectTitle=new JTextField();
    
    JTextField jTextFiledSubjectSection=new JTextField();
    
    JTextField jTextFiledSubjectFaculty=new JTextField();
    
    JTextField jTextFiledSubjectStudent=new JTextField();
   
    JLabel jLabelSubjectName=new JLabel("Product Name");
    
    JLabel jLabelSubjectTitle=new JLabel("Product code");
    
    JLabel jLabelSubjectSection=new JLabel("Price");
    
    JLabel jLabelSubjectFaculty=new JLabel("Stores");
    
    JLabel jLabelSubjectStudent=new JLabel("Quantity");
    
    JLabel jLabel=new JLabel();
    
    JButton jButtonUpdate=new JButton("Read Product Details");
    
    JButton jButtonDelete=new JButton("Delete Data");

     JList<ProductInformationAll> jList=new JList<ProductInformationAll>();
    
    DefaultListModel<ProductInformationAll> defaultListModel=new DefaultListModel<>();
    
   //static JLabel jLabel=new JLabel();
    
    JPanel jPanel=new JPanel();
    
    JSplitPane jSplitPane=new JSplitPane();
    
JScrollBar jScrollBar=new JScrollBar();
    
    FileWriter fileWriter;
    ProductInformationAll courseInformationSampleClassAll=new ProductInformationAll();
public ProductTaken(String product,String emailpassword,String email){
    this.product=product;
    this.emailpassword=emailpassword;
    this.email=email;
}

public void createJrameFrom(){
    
     File file=new File("C:/Project File/MaterialData.txt");
    
    jList.setModel(defaultListModel);
        try{
            int rownumber=0;
            Scanner scanner1=new Scanner(file);
            Scanner scanner=new Scanner(file);
            
    LinkedList <ProductInformationAll> arrayList=new LinkedList<ProductInformationAll>();
              
    while(scanner.hasNext()){
        
   String courseName=scanner.nextLine();
        
   String courseTitle=scanner.nextLine();
   
   String courseSection=scanner.nextLine();
        
   String courseFaculty=scanner.nextLine();
   
   String courseStudent=scanner.nextLine();
   
   String line1=scanner.nextLine();
   
   String line2=scanner.nextLine();
   
   defaultListModel.addElement(new ProductInformationAll( courseName,  courseTitle,  courseFaculty,  courseSection,  courseStudent));
   
    }
    
    jSplitPane.setLeftComponent(new JScrollPane(jList));
       
       jPanel.add(jLabel);
       
       jSplitPane.setRightComponent(jPanel);
       
   GridLayout gridLayout=new GridLayout();
    
    gridLayout.setColumns(1);
gridLayout.setRows(3);
        
jFrame.setLayout(gridLayout);

//jFrame.add(jList);
    jFrame.pack();
    jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
jFrame.setSize(900, 600);
jFrame.add(jSplitPane);
jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jFrame.add(jButtonUpdate);

jButtonUpdate.addMouseListener(new MouseListener(){
                @Override
                public void mouseClicked(MouseEvent me) {
//                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
                actionPerformed();
                
                }

                @Override
                public void mousePressed(MouseEvent me) {
  //                  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void mouseReleased(MouseEvent me) {
    //                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void mouseEntered(MouseEvent me) {
      //              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void mouseExited(MouseEvent me) {
                   // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

});

jFrame.setVisible(true);
        
jList.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
           @Override
           public void valueChanged(ListSelectionEvent lse) {
          //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                
          ProductInformationAll newclass=jList.getSelectedValue();
       
    String chossenSubject=newclass.getProductName();
    String chossenSubjectTitle=newclass.getProductCode();
    String chossenSubjectSection=newclass.getPrice();
    String choosenSubjectFaculty=newclass.getStores();
  //checkthesectionproductplace  
  ProductDetails productCourseDetails=new ProductDetails(product,email,emailpassword,chossenSubject,chossenSubjectTitle,chossenSubjectSection,choosenSubjectFaculty);  
    
  if(productCourseDetails.checkthesectionproductplace(newclass.getQuantity())==1){
  
      productCourseDetails.addIntoTheList();    
  
  }else{
      
      JOptionPane.showMessageDialog(null, "Quantity is already filled");
      
  }
      
     //     JOptionPane.showMessageDialog(null, "Name: "+newclass.getProductName()+"   "+"Id: "+newclass.getProduct Code());
          
           }
            
      });

        }catch(Exception exception){
            
   //JOptionPane.showMessageDialog(null, exception);
            
        }
     
}
     
    private void as(String name,String title,String section,String faculty) {
    
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // JOptionPane.showMessageDialog(null, "I am here");
  JOptionPane.showMessageDialog(null, name);
    
   // return null;
    }

    public void actionPerformed() {
    
        //JOptionPane.showMessageDialog(null, "I am here");
   
  //ShowDataOfMyStorage
  
  ProductDetails productCourseDetails=new ProductDetails(product,emailpassword,email);
  
  productCourseDetails.ShowDataOfMyStorage();
        
    }

}
