Scala REPL 에서 실행 


scala -Xscript -d 로 바이트 코드 생성 후 실행 


scala 로 실행 


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


