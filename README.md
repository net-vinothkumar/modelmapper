# Modelmapper Demo

Sample program to learn the basic usage of ModelMapper.

## How to add the ModelMapper to your project ?

If you’re a Maven user just add the modelmapper library as a dependency:

```
<dependency>
  <groupId>org.modelmapper</groupId>
  <artifactId>modelmapper</artifactId>
  <version>1.1.0</version>
</dependency>
```

Let’s try mapping some objects. Consider the following source and destination object models:

![img](https://user-images.githubusercontent.com/30971809/34463513-291b795e-ee84-11e7-9630-e252363a80c9.png)

User to UserDTO

We can use ModelMapper to implicitly map an user instance to a new UserDTO:

```
ModelMapper modelMapper = new ModelMapper();
UserDTO userDTO = modelMapper.map(user, UserDTO.class);
```

# How It Works ?

When the map method is called, the source and destination types are analyzed to determine which properties implicitly match according to a matching strategy and other configuration.

ModelMapper will do its best to determine reasonable matches between properties.

If required we can also do the explicit mapping between properties.(inform the mapper about the properties explicitly)

```
modelMapper.addMappings(new PropertyMap<User, UserDTO>() {
			protected void configure() {
				map().setUserCity(source.getCity());
			}
		});
```    
