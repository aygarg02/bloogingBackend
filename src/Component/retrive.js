import React, { useState, useEffect } from 'react';
import axios from 'axios';

const Sending = () => {
    const [message, setMessage] = useState('');

    useEffect(() => {
        const fetchData = async () => {
            try {
                const response = await axios.get('http://localhost:8080/api/home');
                setMessage(response.data.message);
            } catch (error) {
                console.error('Error fetching data:', error);
            }
        };

        fetchData();
    }, []); // Empty array means this effect runs only once

    return (
        <div>
            <h1>Data from Server:</h1>
            <p>{message}</p>
        </div>
    );
};

export default Sending;
