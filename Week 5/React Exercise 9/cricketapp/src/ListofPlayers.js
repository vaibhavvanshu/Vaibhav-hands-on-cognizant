import React from "react";

function ListofPlayers() {

    const players = [
        { name: "Virat Kohli", score: 95 },
        { name: "Rohit Sharma", score: 88 },
        { name: "Shubman Gill", score: 45 },
        { name: "KL Rahul", score: 72 },
        { name: "Hardik Pandya", score: 65 },
        { name: "Ravindra Jadeja", score: 90 },
        { name: "R Ashwin", score: 58 },
        { name: "Mohammed Shami", score: 40 },
        { name: "Jasprit Bumrah", score: 78 },
        { name: "Mohammed Siraj", score: 61 },
        { name: "Suryakumar Yadav", score: 82 }
    ];

    const lowScorePlayers = players.filter(player => player.score < 70);

    return (
        <div>

            <h2>List of Players</h2>

            {players.map((player, index) => (
                <p key={index}>
                    {player.name} - {player.score}
                </p>
            ))}

            <h2>Players with score below 70</h2>

            {lowScorePlayers.map((player, index) => (
                <p key={index}>
                    {player.name} - {player.score}
                </p>
            ))}

        </div>
    );
}

export default ListofPlayers;