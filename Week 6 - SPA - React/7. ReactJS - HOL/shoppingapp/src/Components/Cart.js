import React, { Component } from "react";

class Cart extends Component {
	render() {
		return (
			<table border="1" style={{ padding: "10px", textAlign: "center" }}>
				<thead>
					<tr style={{ fontSize: "20px" }}>
						<th>Name</th>
						<th>Price</th>
					</tr>
				</thead>
				<tbody style={{ fontSize: "20px" }}>
					{this.props.items.map((item, index) => (
						<tr key={index}>
							<td>{item.itemname}</td>
							<td>{item.price}</td>
						</tr>
					))}
				</tbody>
			</table>
		);
	}
}

export default Cart;
