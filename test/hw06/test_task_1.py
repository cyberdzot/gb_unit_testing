from hw06.task_1 import Solution
import pytest


@pytest.mark.parametrize("list_1, list_2, result", [
    ([3, 3, 3], [1, 1, 1], "Первый список имеет большее среднее значение"),
    ([1, 1, 1], [3, 3, 3], "Второй список имеет большее среднее значение"),
    ([3, 3, 3], [3, 3, 3], "Средние значения равны"),
])
def test_list_int_comparison(list_1, list_2, result):
    assert Solution().list_int_comparison(list_1, list_2) == result
