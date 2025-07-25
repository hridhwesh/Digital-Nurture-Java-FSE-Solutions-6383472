import React, { Component } from "react";
import "./App.css";

class CountPeople extends Component {
	constructor() {
		super();
		this.state = {
			entryCount: 0,
			exitCount: 0,
		};
	}

	UpdateEntry = () => {
		this.setState((prevState) => ({
			entryCount: prevState.entryCount + 1,
		}));
	};

	updateExit = () => {
		this.setState((prevState) => ({
			exitCount: prevState.exitCount + 1,
		}));
	};

	render() {
		return (
			<div class="main-div">
				<p>
					<button onClick={this.UpdateEntry}>Login</button>{" "}
					{this.state.entryCount} People Entered!!!
				</p>
				<p>
					<button onClick={this.updateExit}>Exit</button> {this.state.exitCount}{" "}
					People Left!!!
				</p>
			</div>
		);
	}
}

export default CountPeople;
