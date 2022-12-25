public class Main {
    public static void main(String[] args) {
int a=27897;
byte b=67;
short c=-159;
long d=987678965549L;
float e=27.12f;
double f=2.786;
System.out.println("Значение переменной a с типом int равно "+ a);
System.out.println("Значение переменной b с типом byte равно "+ b);
System.out.println("Значение переменной c с типом short равно "+ c);
System.out.println("Значение переменной d с типом long равно "+ d);
System.out.println("Значение переменной e с типом float равно "+ e);
System.out.println("Значение переменной f с типом double равно "+ f);
byte lp=23;
byte as=27;
byte ea=30;
short paper=480;
System.out.println("На каждого ученика рассчитано "+paper/(lp+as+ea)+" листов бумаги");
byte efficiencyPerMinute=16/2;
System.out.println("За 20 минут машина произвел "+efficiencyPerMinute*20+ " штук бутылок");
System.out.println("За сутки машина произвел "+efficiencyPerMinute*60*24+ " штук бутылок");
System.out.println("За 3 дня машина произвел "+efficiencyPerMinute*60*24*3+ " штук бутылок");
System.out.println("За 1 месяц машина произвел "+efficiencyPerMinute*60*24*30+ " штук бутылок");
byte allColors = 120;
byte oneClass=2+4;
System.out.println("В школе, где "+allColors/oneClass+" классов, нужно "+allColors/oneClass*2+" банок белой краски и "+allColors/oneClass*4+" банок коричневой краски");
byte banana=80;
byte milk=105;
byte iceCream=100;
byte egg=70;
float breakfast=banana*5+milk*2+iceCream*2+egg*4f;
System.out.println("Завтрак весит "+breakfast+" грамм");
System.out.println("Завтрак весит "+breakfast/1000+" килограмм");
short x=250;
short y=500;
short weight=7000;
System.out.println("Если спортсмен будет терять в весе 250 грамм в день, то он похудеет на 7 кг через "+weight/x+ " дней");
System.out.println("Если спортсмен будет терять в весе 500 грамм в день, то он похудеет на 7 кг через "+weight/y+ " дней");
System.out.println("В среднем спортсмен похудеет на 7 кг через "+(weight/x+weight/y)/2+ " день");
float masha=67760f;
float denis=83690f;
float kristina=76230f;
float mashaAfter=masha*1.1f;
float denisAfter=denis*1.1f;
float kristinaAfter=kristina*1.1f;
float mashaDifference=mashaAfter*12-masha*12;
float denisDifference=denisAfter*12-denis*12;
float kristinaDifference=kristinaAfter*12-kristina*12;
System.out.println("Маша теперь получает "+mashaAfter+" рублей. Годовой доход вырос на "+mashaDifference+ " рублей" );
System.out.println("Денис теперь получает "+denisAfter+" рублей. Годовой доход вырос на "+denisDifference+ " рублей" );
System.out.println("Кристина теперь получает "+kristinaAfter+" рублей. Годовой доход вырос на "+kristinaDifference+ " рублей" );

}
}