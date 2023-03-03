<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context" xsi:schemaLocation="
        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd"> <!-- bean definitions here -->
<context:annotation-config/>
<!--First Object-->

<bean id="animalheart" class="com.cg.springaw.Heart">
<property name="nameofAnimal" value="Tiger"/>
<property name="noofHeart" value="2"/>
</bean>

<!--Second Object-->
<bean id="Humanheart" class="com.cg.springaw.Heart">
<property name="nameofAnimal" value="Human"/>
<property name="noofHeart" value="1"/>
</bean>

<bean id="human" class="com.cg.springaw.Human">
	
</bean>
</beans>

}
