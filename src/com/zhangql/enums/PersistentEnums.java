package com.zhangql.enums;

/**
 *
 * @author Qilun Jiang
 *
 */
public final class PersistentEnums {

	/**
	 *
	 * @param <K>
	 * @param <T>
	 * @param clazz
	 * @param value
	 * @return
	 */
	public static <T extends Enum<T> & PersistentEnum<V>, V> T parse(Class<T> clazz, V value) {

		for(T t : clazz.getEnumConstants()) {
			if(isEquals(t.getValue(), value)) {
				return t;
			}
		}
		return null;
	}

	private static final <T> boolean isEquals(T t1, T t2) {
		if(t1 == null && t2 == null) {
			return true;
		} else if(t1 == null || t2 == null) {
			return false;
		} else {
			return t1.equals(t2);
		}
	}
}
