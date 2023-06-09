import axios from "axios";

const findAll = async () => {
    try {
        const result = await axios.get(
            "http://localhost:8080/api/public/product-list"
        );
        return result.data;
    } catch (error) {
        console.log(error);
    }
};

export  {
    findAll
}