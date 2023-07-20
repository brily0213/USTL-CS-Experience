package 设计模式考试题.第一题;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MemberStrategy strategy = new AdvanceStrategy();
        Price price = new Price(strategy);
        double quote = price.quote(300);
        System.out.println("图书的最终价格为：" + quote);
	    }
	}

