# Anemic vs. Rich Domain Objects

## Rich Model
In an OOP context, an object is a set of functions that operate on encapsulated data. A common mistake is to perceive an object as a mere collection of elements and breach its encapsulation by directly manipulating its fields to meet business needs.
In order to understand the domain deeper and construct a rich domain model, we should encapsulate the data. As a result, we’ll treat the objects as autonomous entities, focusing on their public interface to fulfill the business use cases.

## Anemic Objects

In contrast, an anemic object only exposes a set of data elements that are intended to be manipulated by implicit functions. For instance, we can think of a DTO (Data Transfer Object): it exposes its fields through getters and setters, but it does not know to perform any operation on them.

source: https://www.baeldung.com/java-anemic-vs-rich-domain-objects

