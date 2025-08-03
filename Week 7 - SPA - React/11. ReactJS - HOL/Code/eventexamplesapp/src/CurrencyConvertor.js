import React, { useState } from "react";

export default function CurrencyConvertor() {
	const [amt, setAmt] = useState(0);
	const [field, setField] = useState("");

	const handleSubmit = () => {
		const amtVal = parseFloat(amt);
		const fieldVal = field;
		if (fieldVal.toLowerCase() === "euro" && !isNaN(amtVal)) {
			const eurVal = amtVal * 0.011;
			alert(`Converting to Euro Amount is ${eurVal.toFixed(2)}`);
		} else if (fieldVal.toLowerCase() === "inr" && !isNaN(amtVal)) {
			const inrVal = amtVal * 100.71;
			alert(`Converting to INR Amount is ${inrVal.toFixed(2)}`);
		} else {
			alert("Provide valid amount or currency.");
		}
	};
	return (
		<div>
			<h1 style={{ color: "green" }}>Currency Convertor!!!</h1>
			<div>
				<div
					style={{
						display: "flex",
						alignItems: "flex-start",
					}}>
					<label htmlFor="amt">Amount: </label>
					<input
						style={{ marginLeft: "10px" }}
						type="number"
						value={amt}
						onChange={(e) => setAmt(e.target.value)}
					/>
				</div>
				<br></br>
				<div
					style={{
						display: "flex",
						alignItems: "flex-start",
					}}>
					<label htmlFor="curr" style={{ marginRight: "5px" }}>
						Currency:
					</label>
					<textarea value={field} onChange={(e) => setField(e.target.value)} />
				</div>

				<span style={{ color: "red" }}>
					{" "}
					*"INR" to convert to INR, "Euro" to convert to EURO
				</span>
				<br></br>
				<button style={{ marginLeft: "100px" }} onClick={handleSubmit}>
					Submit
				</button>
			</div>
		</div>
	);
}
