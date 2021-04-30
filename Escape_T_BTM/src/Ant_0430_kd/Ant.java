package Ant_0430_kd;


//ù ��° ���� �κ� ���̰� �� ���� ���� �������鼭 �˰� �� ������ ���� ���� N��
//�� ��° �ٺ��� N+1 ��° �ٱ���, �� ���� ������ �κ� ���� �Ѹ����� ������ ���� ���� ���� K

/*
���� �Է�

3
2 B A
4 A B C D
2 A C

���
A
--B
----C
------D
--C
B
--A

*/
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Ant {
	
	public static void main(String[] args) {
		//input
		Scanner scanner = new Scanner(System.in); 
		//ù�� ó�� for�� ��� ���� 
		int line_num = scanner.nextInt();
		//�Ѷ��ξ� �ֱ� ���� ��Ʈ�� �迭
		String line = "";
		//�ߺ� ���� ��� ��� ���� Array list
		StringBuffer output = new StringBuffer();
		//���� ǥ�� string
		String draw_layer = "--";
		
		/*
		Q1 ���� ��ġ�� ����.. ���������� ���� ����� �ֳ�..?
		*/  
		for (int i=0; i<line_num; i++) {
			int layer = scanner.nextInt();
			for (int j=0; j<layer; j++) {
				String eat = scanner.next();
				for (int k=0; k<j; k++) {
					output.append(draw_layer);
				}
				output.append(eat);
				output.append("\n");
			}
		}
		
		//output	
		System.out.println(output);
	}
}

/* ���� output

B
--A
A
--B
----C
------D
A
--C

 */



