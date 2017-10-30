Java класс Math

Math.abs(n) — возвращает модуль числа n.
Math.round(n) — возвращает целое число, ближайшее к вещественному числу n (округляет n).
Math.ceil(n) — возвращает ближайшее к числу n справа число с нулевой дробной частью (например, Math.ceil(3.4) в результате вернёт 4.0).
Math.cos(n), Math.sin(n), Math.tan(n) — тригонометрические функции sin, cos и tg от аргумента n, указанного в радианах.
Math.acos(n), Math.asin(n), Math.atan(n) — обратные тригонометрические функции, возвращают угол в радианах.
Math.toDegrees(n) — возвращает градусную меру угла в n радианов.
Math.toRadians(n) — возвращает радианную меру угла в n градусов.
Math.sqrt(n) — возвращает квадратный корень из n.
Math.pow(n, b) — возвращает значение степенной функции n в степени b, основание и показатель степени могут быть вещественными.
Math.log(n) — возвращает значение натурального логарифма числа n.
Math.log10(n) — возвращает значение десятичного логарифма числа n.
Все перечисленные функции принимают вещественные аргументы, а тип возвращаемого значения зависит от типа аргумента и от самой функции.

Кроме функций в рассматриваемом классе имеются две часто используемых константы:

Math.PI — число «пи», с точностью в 15 десятичных знаков.
Math.E — число Неппера (основание экспоненциальной функции), с точностью в 15 десятичных знаков.
Примеры использования:

System.out.println(Math.abs(-2.33)); // выведет 2.33
System.out.println(Math.round(Math.PI)); // выведет 3
System.out.println(Math.round(9.5)); // выведет 10
System.out.println(Math.round(9.5-0.001)); // выведет 9
System.out.println(Math.ceil(9.4)); // выведет 10.0
double c = Math.sqrt(3*3 + 4*4);
System.out.println(c); // выведет гипотенузу треугольника с катетами 3 и 4
double s1 = Math.cos(Math.toRadians(60));
System.out.println(s1); // выведет косинус угла в 60 градусов
Задачи


Псевдослучайные числа

В классе Math есть полезная функция без аргументов, которая позволяет генерировать псевдослучайные значения, 
т.е. при каждом вызове этой функции она будет возвращать новое значение, предсказать которое очень сложно 
(не вдаваясь в подробности можно сказать, что теоретически это всё-таки возможно, 
именно поэтому генерируемые функцией числа называются не случайными, а псевдослучайными).

Итак, Math.random() возвращает псевдослучайное вещественное число из промежутка [0;1).

Если требуется получить число из другого диапазона, то значение функции можно умножать на что-то, 
сдвигать и, при необходимости, приводить к целым числам.

Примеры:

System.out.println(Math.random()); // вещественное число из [0;1)
System.out.println(Math.random()+3); // вещественное число из [3;4)
System.out.println(Math.random()*5); // вещественное число из [0;5)
System.out.println( (int)(Math.random()*5) ); // целое число из [0;4]
System.out.println(Math.random()*5+3); // вещественное число из [3;8)
System.out.println( (int)(Math.random()*5+3) ); // целое число из [3;7]
System.out.println( (int)(Math.random()*11) - 5 ); // целое число из [-5;5]
Рассмотрим последовательность преобразований, необходимых для того, 
чтобы из значения функции Math.random() получить целое случайное число из отрезка [-1;3]:
Math.random() 				//[0;1)
Math.random()*5				//[0;5)умножаем оба конца на 5
(int)Math.random()*5		//[0;4] отбрасываем вещественную часть (значения >4)
(int)(Math.random()*5)-1)	//[-1;3] сдвигаем оба конца влево