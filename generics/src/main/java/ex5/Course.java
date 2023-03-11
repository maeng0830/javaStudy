package ex5;

public class Course {
	// 모든 사람이면 등록 가능
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.printf("%S(이)가 Course1을 등록함", applicant.kind.getClass().getSimpleName());
		System.out.println();
	}

	// 학생만 등록 가능
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.printf("%S(이)가 Course2을 등록함", applicant.kind.getClass().getSimpleName());
		System.out.println();
	}

	// 직장인 및 일반인만 등록 가능
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.printf("%S(이)가 Course3을 등록함", applicant.kind.getClass().getSimpleName());
		System.out.println();
	}
}
