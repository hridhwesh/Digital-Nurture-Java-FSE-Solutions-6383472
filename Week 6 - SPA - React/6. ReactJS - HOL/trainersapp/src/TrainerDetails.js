import React from "react";
import { useParams } from "react-router-dom";
import trainersMock from "./TrainersMock";

function TrainerDetails() {
	const { id } = useParams();
	const trainer = trainersMock.find((t) => t.trainerId.toString() === id);

	return (
		<div>
			<h2>Trainer Details</h2>
			<p>
				<b>
					{trainer.name} ({trainer.technology})
				</b>
			</p>
			<p>{trainer.email}</p>
			<p>{trainer.phone}</p>
			<ul>
				{trainer.skills.map((skill, index) => (
					<li key={index}>{skill}</li>
				))}
			</ul>
		</div>
	);
}

export default TrainerDetails;
