package annonymous;

public class Anonymous {
	
	//필드 초기값으로 대입
	Person field = new Person () {
		void work () {
			System.out.println("Go work");
		}
		@Override
		void wake () {
			System.out.println("Wake up at 6.");
			work();
		}
	};
	
	void method1 () {
		//로컬 변수값으로 대입
		Person localVar = new Person () {
			void walk () {
				System.out.println("Take a walk.");
			}
			
			@Override
			void wake () {
				System.out.println("Wake up at 7.");
				walk();
			}
		};
		//로컬 변수 사용
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}
