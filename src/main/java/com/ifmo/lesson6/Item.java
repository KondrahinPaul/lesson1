package com.ifmo.lesson6;

/**
 * Элемент связного списка, хранящий ссылку
 * на следующий элемент и на значение.
 * <p>
 *     Класс package-private, т.к. используется
 *     только для LinkedList'a.
 * </p>
 */
class Item<T> {
    /** Значение элемента. */
    T value;

    /** Ссылка на следующий элемент. */
    Item<T> next;

    /**
     * Инициализирует элемент со значением
     * {@code value}.
     *
     * @param value Значение, которое будет сохранено
     *              в этом элементе.
     */
    Item(T value) {
        this.value = value;
    }
}
