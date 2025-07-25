import React from "react";
import Cart from "./Cart";
import "../App.css";

export class OnlineShopping extends React.Component {
	render() {
		const cartInfo = [
			{ itemname: "Laptop", price: 80000 },
			{ itemname: "TV", price: 120000 },
			{ itemname: "Washing machine", price: 50000 },
			{ itemname: "Mobile", price: 30000 },
			{ itemname: "Fridge", price: 70000 },
		];
		return (
			<div class="mydiv">
				<h1>Items Ordered: </h1>
				<Cart items={cartInfo} />
			</div>
		);
	}
}
