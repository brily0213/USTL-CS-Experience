package ���ģʽ������.��һ��;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MemberStrategy strategy = new AdvanceStrategy();
        Price price = new Price(strategy);
        double quote = price.quote(300);
        System.out.println("ͼ������ռ۸�Ϊ��" + quote);
	    }
	}

