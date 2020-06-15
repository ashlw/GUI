import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

   class ShoppingList implements ActionListener{
      private JFrame frame;
      private JLabel itemList;
      private JLabel priceList;
      private JLabel totalPrice;
      private JButton calc;
      private JButton add;
      private JTextField items;
      private JTextField price;
      String list = "";
      int total = 0;
      public ShoppingList(){
        frame = new JFrame("Shopping List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.yellow);
        frame.getContentPane().setLayout(new GridBagLayout());
        frame.setSize(500,500);
       
       itemList = new JLabel("Entered items shown here");
       GridBagConstraints c = new GridBagConstraints();
       c.fill = GridBagConstraints.HORIZONTAL;
       c.gridx=0;
       c.gridy=0;
       frame.getContentPane().add(itemList, c);
       
       priceList = new JLabel("Entered price shown here");
       c.fill = GridBagConstraints.HORIZONTAL;
       c.gridx=1;
       c.gridy=0;
       frame.getContentPane().add(priceList, c);
       
       totalPrice = new JLabel("Total price:");
       c.fill = GridBagConstraints.HORIZONTAL;
       c.gridx=1;
       c.gridy=1;
       frame.getContentPane().add(totalPrice, c);
       
       calc = new JButton("Add price to total.");
       calc.setActionCommand("calculate");
       calc.addActionListener(this);
       c.fill = GridBagConstraints.HORIZONTAL;
       c.gridx=1;
       c.gridy=2;
       frame.getContentPane().add(calc, c);
       
       add = new JButton("Add item to list.");
       add.setActionCommand("add");
       add.addActionListener(this);
       c.fill = GridBagConstraints.HORIZONTAL;
       c.gridx=0;
       c.gridy=2;
       frame.getContentPane().add(add, c);
       
       
       items = new JTextField("Enter item here", 20);
       c.fill = GridBagConstraints.BOTH;
       c.gridx=0;
       c.gridy=3;
       frame.getContentPane().add(items, c);
       
       price = new JTextField("Enter item price here as integer", 20);
       c.fill = GridBagConstraints.BOTH;
       c.gridx=1;
       c.gridy=3;
       frame.getContentPane().add(price, c);
       
       frame.setVisible(true);
     }
     
     public void actionPerformed(ActionEvent myEvent)
    {
        
        if(myEvent.getActionCommand().equals("add"))
        {
            list += items.getText() + " ";
            
            itemList.setText(list);
        }
        if(myEvent.getActionCommand().equals("calculate")){
            total+= Integer.parseInt(price.getText());
            totalPrice.setText(String.valueOf(total));
        }
    }
}