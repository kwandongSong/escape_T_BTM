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

public class Ant2 {
	
	public static void main(String[] args) {
		//input
		Scanner scanner = new Scanner(System.in); 
		//ù�� ó�� for�� ��� ���� 
		int line_num = scanner.nextInt();
		//�Ѷ��ξ� �ֱ� ���� ��Ʈ�� �迭
		String line = "";
		//�ߺ� ���� ��� ��� ���� Array list
		TreeSet<String> output = new TreeSet<>();
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
					line += draw_layer;
				}
				line += eat;
				line += "\n";
			}
			output.add(line);
			line="";
		}
		
		//output	
		System.out.println(output);
	}
}

/* ���� output

[A
--B
----C
------D
, A
--C
, B
--A
]

 */



