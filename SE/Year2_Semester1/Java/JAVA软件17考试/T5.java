package demo5;
//接口
//①设计一个叫做IUSB的接口，接口有一个方法void useUSB()。
//②编写实现IUSB接口的U盘类UDisk和充电线类UPower，用输出语句简单模拟U盘和充电线的工作状态。
//③编写一个电脑类Computer，该类有setUSB(IUSB usb)方法，该方法的参数是IUSB类型。通过该方法，电脑类对象可以灵活地实现USB插口处设备的更换。电脑类Computer还有一个openUSB()方法，在这个方法里调用对象的useUSB()方法来使用电脑的USB接口。
//④编写主类，实现电脑通过IUSB接口使用U盘。

public class T5 {
	public static void main(String[] args) {
		Computer lenovo = new Computer();
		IUSB usb;
		usb= new UDisk();
//  	usb = new UPower(); //实现设备更换
		lenovo.setUSB(usb);
		lenovo.openUSB();
	}
}

