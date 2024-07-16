package com.ljh.innerclass_;

public class InnerClassExercise {
    public static void main(String[] args) {
        InnerClassExercise innerClassExercise = new InnerClassExercise();
        innerClassExercise.exercise();



    }
    class Inner9{
        public void innerM(){
            exercise();
        }
    }
    private void exercise(){
        new CellPhone().alarmclock(new Bell(){
            @Override
            public void ring() {
                System.out.println(getClass());

                System.out.println("懒猪起床了！");
            }
        });

        new CellPhone().alarmclock(new Bell(){
            @Override
            public void ring() {
                System.out.println(getClass());
                System.out.println("小伙伴开始上课啦！！！");
            }
        });

    }
}

interface Bell{
    void ring();
}

class CellPhone{
    public void alarmclock(Bell bell){
        bell.ring();
    }
}
