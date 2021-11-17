p33_hashmap
Map<type, type> = Map.of(key1, value1, key2, value2...)
1. key and value can be different type
2. same as ArrayList, 以对象为为元素，常见的基本类型需要是引用类型
3. java.util.HashMap
4. 增删改查
   增：put(key, value)
   删：remove(key)
   改：replace(key, value)
   查：get(key)

   size: map.size()
   forEach():  map.forEach((key, value) -> {})