import React from "react";
import { BrowserRouter, Routes, Route, Link } from "react-router-dom";
import TrainersList from "./trainerlist";
import Home from "./Home";
import TrainerDetails from "./TrainerDetails";

function App() {
	return (
		<BrowserRouter>
			<div>
				<h1>My Academy Trainers App</h1>
				<Link to="/">Home</Link>
				{" | "}
				<Link to="/trainers"> Show Trainers</Link>

				<Routes>
					<Route path="/" element={<Home />} />
					<Route path="/trainers" element={<TrainersList />} />
					<Route path="/trainer/:id" element={<TrainerDetails />} />
				</Routes>
			</div>
		</BrowserRouter>
	);
}
export default App;
