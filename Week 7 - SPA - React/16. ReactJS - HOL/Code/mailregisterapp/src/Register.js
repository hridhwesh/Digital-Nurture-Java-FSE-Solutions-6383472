import React from "react";

class Register extends React.Component {
	constructor(props) {
		super(props);
		this.state = {
			fullName: "",
			email: "",
			password: "",
		};

		this.handleChange = this.handleChange.bind(this);
		this.handleSubmit = this.handleSubmit.bind(this);
	}

	handleChange(event) {
		const { name, value } = event.target;
		this.setState({ [name]: value });
	}

	handleSubmit(event) {
		event.preventDefault();

		const { fullName, email, password } = this.state;
		const validEmailRegex = RegExp(
			/^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@(([^<>()[\]\\.,;:\s@"]+\.)+[^<>()[\]\\.,;:\s@"]{2,})$/i
		);

		let errors = [];

		if (fullName.trim().length < 5) {
			errors.push("Name must be at least 5 characters long.");
		}

		if (!validEmailRegex.test(email)) {
			errors.push("Email is not valid!");
		}

		if (password.length < 8) {
			errors.push("Password must be at least 8 characters long.");
		}

		if (errors.length > 0) {
			alert(errors.join("\n"));
		} else {
			alert("Registration Successful!");
			this.setState({
				fullName: "",
				email: "",
				password: "",
			});
		}
	}

	render() {
		const { fullName, email, password } = this.state;

		return (
			<div
				style={{
					display: "flex",
					justifyContent: "center",
					alignItems: "center",
					height: "100vh",
					flexDirection: "column",
				}}>
				<h2
					style={{
						color: "red",
						fontWeight: "bold",
						fontSize: "24px",
						marginBottom: "20px",
					}}>
					Register Here
				</h2>
				<form
					style={{
						display: "flex",
						flexDirection: "column",
						alignItems: "flex-start",
						gap: "10px",
					}}
					onSubmit={this.handleSubmit}>
					<div>
						<label htmlFor="fullName">Name:</label>
						<input
							type="text"
							id="fullName"
							name="fullName"
							value={fullName}
							onChange={this.handleChange}
						/>
					</div>

					<div>
						<label htmlFor="email">Email:</label>
						<input
							type="email"
							id="email"
							name="email"
							value={email}
							onChange={this.handleChange}
						/>
					</div>

					<div>
						<label htmlFor="password">Password:</label>
						<input
							type="password"
							id="password"
							name="password"
							value={password}
							onChange={this.handleChange}
						/>
					</div>

					<button
						style={{ padding: "5px 15px", marginTop: "10px" }}
						type="submit">
						Submit
					</button>
				</form>
			</div>
		);
	}
}

export default Register;
