package knuth4;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
public class Knuth4{
	private JFrame	frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	/**
	 * Launch the application.
	 */
	public static void main(final String[] args){
		EventQueue.invokeLater(new Runnable(){
			@Override
			public void run(){
				try{
					final Knuth4 window=new Knuth4();
					window.frame.setVisible(true);
				}catch(final Exception e){
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public Knuth4(){
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(){
		textField = new JTextField();
		textField.setToolTipText("Введите ");
		frame=new JFrame();
		frame.setBounds(100,100,808,350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		final JLabel lblNewLabel=new JLabel("object1");
		lblNewLabel.setBounds(21, 57, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		final JScrollPane scrollPane=new JScrollPane();
		scrollPane.setBounds(179, 39, 293, 211);
		frame.getContentPane().add(scrollPane);
		final JTextArea textArea=new JTextArea();
		textArea.setFont(new Font("Arial Unicode MS",Font.PLAIN,16));
		scrollPane.setViewportView(textArea);
		
		JLabel lblObject = new JLabel("object2");
		lblObject.setBounds(21, 82, 46, 14);
		frame.getContentPane().add(lblObject);
		
		JLabel lblObject_1 = new JLabel("object3");
		lblObject_1.setBounds(21, 107, 46, 14);
		frame.getContentPane().add(lblObject_1);
		
		JLabel lblObject_2 = new JLabel("object4");
		lblObject_2.setBounds(21, 132, 46, 14);
		frame.getContentPane().add(lblObject_2);
		
		
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t1 = textField.getText();
			}
		});
		textField.setBounds(83, 54, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Введите");
		textField_1.setBounds(83, 79, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("Введите");
		textField_2.setBounds(83, 104, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("Введите");
		textField_3.setBounds(83, 129, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(482, 39, 111, 211);
		frame.getContentPane().add(scrollPane_2);
		
		final JTextArea textArea_1 = new JTextArea();
		scrollPane_2.setViewportView(textArea_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(603, 39, 167, 211);
		frame.getContentPane().add(scrollPane_1);
		
		final JTextArea textArea_2 = new JTextArea();
		scrollPane_1.setViewportView(textArea_2);
		
		JLabel label = new JLabel("поле для вывода результата Трамвайные билеты и Монеты");
		label.setBounds(179, 11, 331, 14);
		frame.getContentPane().add(label);
		final JMenuBar menuBar=new JMenuBar();
		frame.setJMenuBar(menuBar);
		final JToolBar toolBar=new JToolBar();
		menuBar.add(toolBar);
		
		JButton btnExamples = new JButton("Examples");
		toolBar.add(btnExamples);
		btnExamples.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// трамвай ---------------------------------------
				final Character d0='0';
				final Character d1='1';
				final Character d2='2';
				final Character d3='3';
				final Character d4='4';
				final Character d5='5';
				final Character d6='6';
				final Character d7='7';
				final Character d8='8';
				final Character d9='9';
				//
				ArrayList<Object> placeSet0=new ArrayList<>();
				placeSet0.add(d0);
				placeSet0.add(d1);
				placeSet0.add(d2);
				placeSet0.add(d3);
				placeSet0.add(d4);
				placeSet0.add(d5);
				placeSet0.add(d6);
				placeSet0.add(d7);
				placeSet0.add(d8);
				placeSet0.add(d9);
				//
				ArrayList<Object> placeSet1=(ArrayList<Object>)placeSet0.clone();
				ArrayList<Object> placeSet2=(ArrayList<Object>)placeSet0.clone();
				ArrayList<Object> placeSet3=(ArrayList<Object>)placeSet0.clone();
				final ArrayList<Object> placeSet4=(ArrayList<Object>)placeSet0.clone();
				final ArrayList<Object> placeSet5=(ArrayList<Object>)placeSet0.clone();
//
				ArrayList<ArrayList<Object>> symbolPlace=new ArrayList<ArrayList<Object>>();
				symbolPlace.add(placeSet0);
				symbolPlace.add(placeSet1);
				symbolPlace.add(placeSet2);
				symbolPlace.add(placeSet3);
				symbolPlace.add(placeSet4);
				symbolPlace.add(placeSet5);
				// ****************************
				NTuple nt=new NTuple(symbolPlace);
				// ***************************
				int counter0=0;
				while(nt.hasNext()){
					final ArrayList<Integer> alobject=nt.next();
					if((alobject.get(0)+alobject.get(1)+alobject.get(2))==(alobject.get(3)
							+alobject.get(4)+alobject.get(5))){
						counter0++;
					}
				}
				textArea.append("Число +"+" 'счастливых' " +" билетов: " +  counter0+"\n");
				textArea.append("---------------------------------\n");
				textArea.paintAll(textArea.getGraphics());
				// монеты ---------------------------------------
				final int a1=2;
				final int a2=3;
				final int a3=5;
				final int a4=7;
				final int m=100;
				//
				placeSet0=new ArrayList<>();
				for(int i=0;i<=(m/a1);i++){
					final Integer j=i;
					placeSet0.add(j);
				}
				placeSet1=new ArrayList<>();
				for(int i=0;i<=(m/a2);i++){
					final Integer j=i;
					placeSet1.add(j);
				}
				placeSet2=new ArrayList<>();
				for(int i=0;i<=(m/a3);i++){
					final Integer j=i;
					placeSet2.add(j);
				}
				placeSet3=new ArrayList<>();
				for(int i=0;i<=(m/a4);i++){
					final Integer j=i;
					placeSet3.add(j);
				}
				symbolPlace=new ArrayList<ArrayList<Object>>();
				symbolPlace.add(placeSet0);
				symbolPlace.add(placeSet1);
				symbolPlace.add(placeSet2);
				symbolPlace.add(placeSet3);
				// ****************************
				nt=new NTuple(symbolPlace);
				counter0=0;
				while(nt.hasNext()){
					final ArrayList<Integer> alobject=nt.next();
					if(((alobject.get(0)*a1)+(alobject.get(1)*a2)+(alobject.get(2)*a3)+(alobject
							.get(3)*a4))==m){
						counter0++;
						textArea.append(counter0+":"  +" " +"2x" +  alobject.get(0)+""+"+"+"3x"+alobject.get(1)+" +"+"5x"
								+alobject.get(2)+" +"+"7x"+alobject.get(3)+"=100"+"\n");
					}
				}
				textArea.append(counter0+"\n");
				textArea.append("game over---------------------------------\n");
				textArea_1.paintAll(textArea.getGraphics());
				
				
				
				
				
				
				
				
				
				
			}
		});
		final JButton btnNewButton=new JButton("NTuple");
		toolBar.add(btnNewButton);
		final JButton btnPermutation=new JButton("Permutation");
		menuBar.add(btnPermutation);
		btnPermutation.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(final ActionEvent arg0){
				// =====================================================
// permutations
				final ArrayList<MyObject> ali=new ArrayList<>();
				//
				ali.add(new MyObject(1));
				ali.add(new MyObject(2));
				ali.add(new MyObject(2));
				ali.add(new MyObject(3));
				//
				final Permutation p=new Permutation(ali);
				textArea_2.append(p.ali+"\n");
				System.out.println(p.ali);
				while(p.hasNext()){
					final ArrayList<MyObject> e1=p.next();
					textArea_2.append(e1+"\n");
					System.out.println(e1);
				}
				textArea_2.append("game over---------------------------------\n");
				textArea_2.paintAll(textArea_2.getGraphics());
// =====================================================
			}
		});
		btnNewButton.addActionListener(new ActionListener(){
			@SuppressWarnings({"rawtypes","unchecked"})
			@Override
			public void actionPerformed(final ActionEvent e){
				// textArea.append("klfxcjb\n");
				// трамвай ---------------------------------------
			    final Character d0='0';
				final Character d1='1';
				final Character d2='2';
				final Character d3='3';
				final Character d4='4';
				final Character d5='5';
				final Character d6='6';
				final Character d7='7';
				final Character d8='8';
				final Character d9='9';
				//
				ArrayList<Object> placeSet0=new ArrayList<>();
				placeSet0.add(d0);
				placeSet0.add(d1);
				placeSet0.add(d2);
				placeSet0.add(d3);
				placeSet0.add(d4);
				placeSet0.add(d5);
				placeSet0.add(d6);
				placeSet0.add(d7);
				placeSet0.add(d8);
				placeSet0.add(d9);
				//
				ArrayList<Object> placeSet1=(ArrayList<Object>)placeSet0.clone();
				ArrayList<Object> placeSet2=(ArrayList<Object>)placeSet0.clone();
				ArrayList<Object> placeSet3=(ArrayList<Object>)placeSet0.clone();
				final ArrayList<Object> placeSet4=(ArrayList<Object>)placeSet0.clone();
				final ArrayList<Object> placeSet5=(ArrayList<Object>)placeSet0.clone();
//
				ArrayList<ArrayList<Object>> symbolPlace=new ArrayList<ArrayList<Object>>();
				symbolPlace.add(placeSet0);
				symbolPlace.add(placeSet1);
				symbolPlace.add(placeSet2);
				symbolPlace.add(placeSet3);
				symbolPlace.add(placeSet4);
				symbolPlace.add(placeSet5);
				// ****************************
				NTuple nt=new NTuple(symbolPlace);
				// ***************************
				int counter0=0;
				while(nt.hasNext()){
					final ArrayList<Integer> alobject=nt.next();
					if((alobject.get(0)+alobject.get(1)+alobject.get(2))==(alobject.get(3)
							+alobject.get(4)+alobject.get(5))){
						counter0++;
					}
				}
				//textArea.append("Число +"+" 'счастливых' " +" билетов: " +  counter0+"\n");
				//textArea.append("---------------------------------\n");
				//textArea.paintAll(textArea.getGraphics());
				// монеты ---------------------------------------
				final int a1=2;
				final int a2=3;
				final int a3=5;
				final int a4=7;
				final int m=100;
				//
				placeSet0=new ArrayList<>();
				for(int i=0;i<=(m/a1);i++){
					final Integer j=i;
					placeSet0.add(j);
				}
				placeSet1=new ArrayList<>();
				for(int i=0;i<=(m/a2);i++){
					final Integer j=i;
					placeSet1.add(j);
				}
				placeSet2=new ArrayList<>();
				for(int i=0;i<=(m/a3);i++){
					final Integer j=i;
					placeSet2.add(j);
				}
				placeSet3=new ArrayList<>();
				for(int i=0;i<=(m/a4);i++){
					final Integer j=i;
					placeSet3.add(j);
				}
				symbolPlace=new ArrayList<ArrayList<Object>>();
				symbolPlace.add(placeSet0);
				symbolPlace.add(placeSet1);
				symbolPlace.add(placeSet2);
				symbolPlace.add(placeSet3);
				// ****************************
				nt=new NTuple(symbolPlace);
				counter0=0;
				while(nt.hasNext()){
					final ArrayList<Integer> alobject=nt.next();
					if(((alobject.get(0)*a1)+(alobject.get(1)*a2)+(alobject.get(2)*a3)+(alobject
							.get(3)*a4))==m){
						counter0++;
					//	textArea.append(counter0+":"  +" " +"2x" +  alobject.get(0)+""+"+"+"3x"+alobject.get(1)+" +"+"5x"
						//		+alobject.get(2)+" +"+"7x"+alobject.get(3)+"=100"+"\n");
					}
				}
				//textArea.append(counter0+"\n");
			//	textArea.append("game over---------------------------------\n");
			//	textArea.paintAll(textArea.getGraphics());
				// *********************************************
				// иероглиф
// --------------------------------------------------
				// ******************************
				String t1 = textField.getText();
				String t2 = textField_1.getText();
				String t3 = textField_2.getText();
				String t4 = textField_3.getText();
				final String c0=t1;
				final String c1=t2;
				final String c2=t3;
				final String c3=t4;
				//
				placeSet0=new ArrayList<>();
				placeSet0.add(c0);
				placeSet0.add(c1);
				placeSet0.add(c2);
				placeSet0.add(c3);
				placeSet1=(ArrayList<Object>)placeSet0.clone();
				placeSet2=(ArrayList<Object>)placeSet0.clone();
				placeSet3=(ArrayList<Object>)placeSet0.clone();
				//
				symbolPlace=new ArrayList<ArrayList<Object>>();
				symbolPlace.add(placeSet0);
				symbolPlace.add(placeSet1);
				symbolPlace.add(placeSet2);
				symbolPlace.add(placeSet3);
				// ****************************
				nt=new NTuple(symbolPlace);
				counter0=0;
				while(nt.hasNext()){
					final ArrayList<Integer> alobject=nt.next();
					final int n=symbolPlace.size();
					for(int i=0;i<n;i++){
						final int j=alobject.get(i);
						final Object o=symbolPlace.get(i).get(j);
						textArea_1.append(o.toString());
						counter0++;
					}
					textArea_1.append("\n");
				}
				textArea_1.append("Число комбинации:"+counter0+"\n");
				//textArea.append("game over---------------------------------\n");
				textArea_1.paintAll(textArea.getGraphics());
				// *********************************************
// c0='z';
// c1='s';
// c2='b';
// c3='.';
// //
// placeSet0=new ArrayList<>();
// placeSet0.add(c0);
// placeSet0.add(c1);
// placeSet0.add(c2);
// for(int i=0;i<(17-3);i++){
// placeSet0.add(c3);
// }
// //
// symbolPlace=new ArrayList<ArrayList<Object>>();
// for(int i=0;i<17;i++){
// symbolPlace.add(placeSet0);
// }
// // ****************************
// nt=new NTuple(symbolPlace);
// counter0=0;
// while(nt.hasNext()){
// nt.next();
// counter0++;
// }
// textArea.append(counter0+"\n");
// textArea.append("game over---------------------------------\n");
// textArea.paintAll(textArea.getGraphics());
				// *********************************************
			}
		});
	}
}
