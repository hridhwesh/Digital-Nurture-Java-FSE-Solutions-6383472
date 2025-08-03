import { useState } from "react";
import CurrencyConvertor from "./CurrencyConvertor.js";

export default function MainApp() {
	const [count, setCount] = useState(0);

	const sayHello = () => {
		alert("Hello! Member!");
	};
	const increment = () => {
		setCount((prev) => prev + 1);
	};
	const decrement = () => {
		setCount((prev) => prev - 1);
	};
	const handleIncrement = () => {
		increment();
		sayHello();
	};
	const sayWelcome = (message) => {
		alert(message);
	};
	const onPress = () => {
		alert("I was clicked");
	};

	return (
		<div>
			<h2>{count}</h2>
			<button onClick={handleIncrement}>Increment</button>
			<br></br>
			<button onClick={decrement}>Decrement</button>
			<br></br>
			<button onClick={() => sayWelcome("welcome")}>Say Welcome</button>
			<br></br>
			<button onClick={onPress}>Click On Me!</button>
			<br></br>
			<CurrencyConvertor />
		</div>
	);
}
