package packtestnfc.text;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Testy {

	private static final String TEXT = "Язык программирования - это искусственный язык, созданный для передачи команд машинам, в частности компьютерам.\n"
			+ "Языки программирования используются для создания программ, которые контролируют поведение машин, и записи алгоритмов.\n"
			+ "Более строгое определение: язык программирования - это система обозначений для описания алгоритмов и структур данных.\n"
			+ "Язык программирования определяет набор лексических, синтаксических и семантических правил, задающих\n"
			+ "внешний вид программы и действия, которые выполняет исполнитель (компьютер) под ее управлением?\n"
			+ "Со времени создания первых программируемых машин было создано более двух с половиной тысяч языков программирования!\n"
			+ "Некоторыми языками умеет пользоваться только небольшое число их собственных разработчиков, другие становятся известны миллионам людей.\n"
			+ "Профессиональные программисты обычно применяют в своей работе несколько языков программирования.";

	private static final Set<Integer> VOWELS = "*.".chars().boxed().collect(Collectors.toSet());

	public static void main(String[] args) {
		final Set<String> words = Arrays.stream(TEXT.split("[\\p{Punct}\\s]+")).map(String::toLowerCase).distinct()
				.collect(Collectors.toSet());
		final Map<String, Long> vowelCount = words.stream()
				.collect(Collectors.toMap(Function.identity(), w -> w.chars().filter(VOWELS::contains).count()));
		final List<String> orderedWords = words.stream().sorted((a, b) -> (int) (vowelCount.get(a) - vowelCount.get(b)))
				.collect(Collectors.toList());
		System.out.println(orderedWords);
	}
}
