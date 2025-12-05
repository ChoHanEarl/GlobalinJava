package operator;

public class Operator2 {
	public static void main(String[] args) {
		int i = 10;
		int j = 3;
		int result = i / j;
		int rest = i % j;
		System.out.println(result);
		System.out.println(rest);
		
		//게시글 수 31개, 페이지당 최대 게시글 수 10개
		//페이지 하단 표시되는 페이지가 4개가 되려면?
		int write = 31;
		int page = 10;
		int totalPage = write / page + 1;
		System.out.println(totalPage);
	}
}
