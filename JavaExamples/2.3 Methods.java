public class Home
{
    public static void main(String[] args)	//неизменяемая часть. каждый класс начинается с этой строки
    {
     System.out.println("привет мир!");
    }
}

public //модификатор			доступны из:
	//public					любой класс, любой пакет
	//no modifier (package)		свой класс, свой пакет
	//private					только свой класс
	
static //модификатор
	//
	
void //тип возвращаемого значения
		//void		ничего не возвращает
		//любой другой тип. в теле метода обязателен оператор return
		//String	возвращает строку
		//int		возвращает целое число
		//double	возвращает дробное число