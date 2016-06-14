package com.zhangql.enums;

/**
 *
 * @author Qilun Jiang
 *
 * @param <T>
 */
public interface PersistentEnum<T> {

	T getValue();

	String getDisplayName();
}
