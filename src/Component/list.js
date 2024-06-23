import React, { useEffect, useState } from 'react';

const Ingredients = () => {
    const [ingredients, setIngredients] = useState([]);

    useEffect(() => {
        fetch('http://localhost:8080/ingre')
            .then(response => response.json())
            .then(data => setIngredients(data))
            .catch(error => console.error('Error fetching ingredients:', error));
    }, []);

    // Handle loading state or other conditions
    if (!ingredients || ingredients.length === 0) {
        return <div>Loading...</div>;
    }

    // Function to group ingredients by type
    const groupBy = (array, key) => {
        return array.reduce((result, currentValue) => {
            (result[currentValue[key]] = result[currentValue[key]] || []).push(currentValue);
            return result;
        }, {});
    };

    // Group ingredients by type
    const groupedIngredients = groupBy(ingredients, 'type');

    return (
        <div>
            <h2>Ingredients List</h2>
            {Object.keys(groupedIngredients).map(type => (
                <div key={type}>
                    <h3>{type}</h3>
                    <ul>
                        {groupedIngredients[type].map(ingredient => (
                            <li key={ingredient.id}>
                                <input type="checkbox" id={ingredient.id} name={ingredient.name} />
                                <label htmlFor={ingredient.id}>{ingredient.name}</label>
                            </li>
                        ))}
                    </ul>
                </div>
            ))}
        </div>
    );
};

export default Ingredients;
