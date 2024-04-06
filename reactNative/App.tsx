import { StatusBar } from "expo-status-bar";
import { Button, Pressable, StyleSheet, Text, View, Image } from "react-native";
import { useState } from "react";

export default function App() {
  var [image, setImage] = useState({
    uri: "https://i.pinimg.com/736x/44/0e/6c/440e6cc9bbb143e2b5bea39f3f5cc158.jpg",
  });

  const [i, setI] = useState(0);

  function Test() {
    setI(i + 1);
    setImage({ uri: `https://picsum.photos/400/400?random=${i}` });
  }

  return (
    <View style={styles.container}>
      <Button title="bottone" onPress={Test} />
      <Pressable style={styles.pressable}>
        <Text onPress={Test} style={styles.textPressable}>
          pressable
        </Text>
      </Pressable>
      <Image style={styles.img} source={image} />
      <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: "center",
    justifyContent: "center",
  },

  pressable: {
    position: "relative",
    padding: 0,
    overflow: "hidden",
    backgroundColor: "#2ecc71",
    color: "#ecf0f1",
    margin: 10,
    borderRadius: 2,
    paddingBottom: 10,
    paddingLeft: 5,
    paddingRight: 5,
    paddingTop: 10,
    elevation: 5,
  },

  textPressable: {
    color: "white",
    textTransform: "uppercase",
    fontWeight: "bold",
  },

  img: {
    width: 400,
    height: 400,
    resizeMode: "contain",
    padding: 10,
  },
});
