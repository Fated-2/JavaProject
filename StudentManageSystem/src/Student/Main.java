package Student;

//123
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
//(ֻ����һ������public��)
public class Main {

	
	public static void main(String[] args) {
		new LoginDemo();

	}

}

//��д��¼ҳ�棺
class LoginDemo extends JFrame{
	//�û����Լ����룺
	private String username="123";
	private String password="123";
	//����
	public JFrame window;
	//�û��������롢�ı���
	public JTextField user;
	public JPasswordField pwd;
	//��¼�İ�ť
	public JButton login;
	//��������ʼ��
	public LoginDemo() {
		//����ʼ����
		window=new JFrame("ѧ������ϵͳ");
		//���óߴ�  600   400��
		window.setSize(600, 400);
		//������ʾ��
		window.setLocationRelativeTo(null);
		//Ĭ�Ͽɹرգ�
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//����Ϊ���Բ��֣�
		window.setLayout(null);
		//���ô��ڴ�С���ɱ䣺
		window.setResizable(false);
		
		/*
		 * �û���ǩusername_label��100 100 100 50
		 * �����ǩpassword_label��100 200 100 50
		 * �û����ı���user��150 100 300 50
		 * �����ı���pwd��150 200 300 50
		 * ��ťlogin��250 300 100 50
		 */
		//�û�
		JLabel username_label = new JLabel("�û�");
		username_label.setBounds(100, 100, 100, 50);
		window.add(username_label);
		
		user=new JTextField();
		user.setBounds(150, 100, 300, 50);
		window.add(user);
		
		//����
		JLabel password=new JLabel("����");
		password.setBounds(100, 200, 100, 50);
		window.add(password);
		
		pwd=new JPasswordField();
		pwd.setBounds(150, 200, 300, 50);
		window.add(pwd);
		
		//��ť
		login=new JButton("��¼");
		login.setBounds(250, 300, 100, 50);
		window.add(login);
		
		init();//���ü����¼�
		
		//�������ɼ�
		window.setVisible(true);
	}
	
	//������ť�¼�
	public void init(){
		//��¼��ť�ļ�����
		login.addActionListener(new ActionListener() {
			//����걻����ʱ����ø÷���
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(user.getText());
				System.out.println(pwd.getText());
				//�û�����������ȷ ����ȷ
				if(user.getText().equals(username) && pwd.getText().equals(password)){
					
					/*
					 * ������ʾ����ȷ  ��ת����  ��¼ҳ����ʧ
					 */
					JOptionPane .showMessageDialog(null, "������ȷ","��¼��ʾ��",JOptionPane.INFORMATION_MESSAGE);
					StudentJPanel sp=new StudentJPanel();
					window.dispose();//�رմ��ڣ�
					
				}else{
					//���벻��ȷ  ������ʾ�򣺴���  ��¼ҳ���ı���������ʧ
					JOptionPane .showMessageDialog(null, "������������µ�¼","��¼��ʾ��",JOptionPane.INFORMATION_MESSAGE);
					user.setText(null);
					pwd.setText(null);//��������Ϊ��
					
				}
				
			}
		});
	}
	
	
}
