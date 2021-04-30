package Ant_0430_kd;


//첫 번째 줄은 로봇 개미가 각 층을 따라 내려오면서 알게 된 먹이의 정보 개수 N개
//두 번째 줄부터 N+1 번째 줄까지, 각 줄의 시작은 로봇 개미 한마리가 보내준 먹이 정보 개수 K

/*
예제 입력

3
2 B A
4 A B C D
2 A C

결과
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
		//첫줄 처리 for문 몇번 돌지 
		int line_num = scanner.nextInt();
		//한라인씩 넣기 위한 스트링 배열
		String line = "";
		//중복 제거 결과 출력 위한 Array list
		StringBuffer output = new StringBuffer();
		//층수 표현 string
		String draw_layer = "--";
		
		/*
		Q1 포문 겹치기 지양.. 삼중포문을 피할 방법이 있나..?
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

/* 현재 output

B
--A
A
--B
----C
------D
A
--C

 */



