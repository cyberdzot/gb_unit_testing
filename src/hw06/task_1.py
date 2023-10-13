class Solution:

    def list_int_comparison(self, list_1: list[int], list_2: list[int]) -> str:
        """Сравнить два списка с 'числами' по среднему арифметическому значению."""
        avg_1 = self.get_avg(list_1)
        avg_2 = self.get_avg(list_2)

        if avg_1 > avg_2:
            return "Первый список имеет большее среднее значение"
        elif avg_1 < avg_2:
            return "Второй список имеет большее среднее значение"
        else:
            return "Средние значения равны"

    def get_avg(self, list_: list[int]) -> float | int:
        """Получить среднее арифметическое значение из списка с 'числами'."""
        if not list_:
            raise ValueError('Функция get_avg(): передан пустой список!')
        elif self.isnotnumeric(list_):
            raise ValueError('Функция get_avg(): передан список содержащий не только цифры!')
        return sum(list_) / len(list_)

    @staticmethod
    def isnotnumeric(list_: list) -> bool:
        """Проверить, что в списке присутствуют любые другие символы кроме цифр."""
        for item in list_:
            if not str(item).isnumeric():
                return True
        return False
