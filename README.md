스칼라 파일 실행방법 

1. Scala REPL 에서 실행 
2. scala -Xscript -d 로 바이트 코드 생성 후 실행 
3. scala 로 실행 


외부 에디터에서 소스를 작성후 Scala REPL :paste 옵션으로 붙여넣기 후 ctrl + d 로 나옴 

스칼라 워크시트에서 수행  IDE 
object xxx {
 // code here 
}
로 감싸서 처리해주자 

-cp classpath : 클래스 로딩을 시켜준다 






apply method

val p1 = Pont.apply(1, 2)
val p2 = Point(1,2)

동반 클래스의 생성자 모양에 따라 사용할 수 있고 내부적으로는 apply 호출 됨 



extends 
with trait <- mixin 한다 
java 에서 인터페이스를 구현한다 와 같음 


object
- 싱글턴 객체
- 각 싱글톤 객체의 인스턴스는 유일 
- 어떤 싱글톤 객체와 같은 이름의 클래스가 한 소스 파일 안에 있으면 싱글톤 객체를 그 클래스의 동반 객체라고 한다 
 ...
 
Companion Object 
- 동반 객체의 비공개 멤버에 접근할수 있다 
- 클래스와 하나이상의 트레이트를 확장할수 있다 
- apply Factory method pattern 의 getInstance 와 같다 


자바 클래스에서는 이넘클래스인경우 .class 파일의 끝에 $ 가 붙지만 scala 의 경우에는 object 를 컴파일 하면 생긴다.


