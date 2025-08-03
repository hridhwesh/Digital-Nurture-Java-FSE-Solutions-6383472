import React, { useState } from "react";

function ComplaintRegister() {
	const [name, setName] = useState("");
	const [complaint, setComplaint] = useState("");
	const [refNo, setRefNo] = useState(1);

	function handleSubmit(e) {
		e.preventDefault();

		if (name === "" || complaint === "") {
			alert("Kindly fill the required details");
		} else {
			setRefNo((prevRefNo) => prevRefNo + 1);
			alert(
				`Thanks ${name}\nYour complaint was submitted\nReference ID:${refNo}`
			);
		}
	}

	return (
		<div>
			<div style={{ paddingLeft: "500px", paddingTop: "50px" }}>
				<h1 style={{ color: "red" }}>Register your complaints here!!</h1>
				<form onSubmit={handleSubmit}>
					<div>
						<label>Name:</label>
						<input
							required
							value={name}
							onChange={(e) => setName(e.target.value)}
							style={{ marginLeft: "50px" }}
						/>
					</div>
					<br></br>
					<label>Complaint:</label>
					<textarea
						required
						value={complaint}
						onChange={(e) => setComplaint(e.target.value)}
						style={{ marginLeft: "20px" }}
					/>
					<br></br>
					<button type="submit" style={{ marginLeft: "140px" }}>
						Submit
					</button>
				</form>
			</div>
		</div>
	);
}

export default ComplaintRegister;
