package demo5;
//�ӿ�
//�����һ������IUSB�Ľӿڣ��ӿ���һ������void useUSB()��
//�ڱ�дʵ��IUSB�ӿڵ�U����UDisk�ͳ������UPower�����������ģ��U�̺ͳ���ߵĹ���״̬��
//�۱�дһ��������Computer��������setUSB(IUSB usb)�������÷����Ĳ�����IUSB���͡�ͨ���÷���������������������ʵ��USB��ڴ��豸�ĸ�����������Computer����һ��openUSB()�������������������ö����useUSB()������ʹ�õ��Ե�USB�ӿڡ�
//�ܱ�д���࣬ʵ�ֵ���ͨ��IUSB�ӿ�ʹ��U�̡�

public class T5 {
	public static void main(String[] args) {
		Computer lenovo = new Computer();
		IUSB usb;
		usb= new UDisk();
//  	usb = new UPower(); //ʵ���豸����
		lenovo.setUSB(usb);
		lenovo.openUSB();
	}
}

