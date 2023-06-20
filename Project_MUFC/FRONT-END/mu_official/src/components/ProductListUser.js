import React, {useEffect, useState} from "react";
import {findAll} from "../service/product/ProductService";
import Footer from "./common/footer/Footer";

const ProductListUser = function () {
    const [products, setProducts] = useState([]);
    const productList = async () => {
        const result = await findAll();
        setProducts(result);
    };

    useEffect(() => {
        productList();
    }, [])
    return (
        <>
            <div style={{margin: "150px 0"}}>
                <div className="row mx-0 ">
                    <div className="event">
                        <div className="row mx-0 ps-5">
                            <div>
                                <h3
                                    style={{
                                        color: "#f26b38",
                                        fontSize: "24px",
                                        fontWeight: 600,
                                    }}
                                >
                                    ?
                                </h3>
                            </div>
                        </div>
                        <div class="row mx-0 ps-5">
                            {products.map((product) => (
                                <div className="col-md-4 container">
                                    <div className="card">
                                        <div className="card-img">
                                            <img
                                                style={{ height: 400 }}
                                                src={product.imgProduct}
                                                className="image"
                                             alt={product.imgProduct}/>
                                        </div>
                                        <div className="card-details">
                                            <div className="price">
                                                <p style={{ color: "red" }}>Reduced: <strong style={{ color: "red" }}>£{product.sellPrice}</strong></p>
                                                <span className="strikethrough"> Regular: £{product.price}</span>
                                            </div>
                                        </div>
                                        <div className="card-header">
                                            <p>{product.name}</p>
                                            <span>New</span>
                                        </div>

                                        <div className="card-footer">
                                            <button>Buy now</button>
                                        </div>
                                    </div>
                                </div>
                            ))}
                        </div>
                    </div>
                </div>
            </div>
            <Footer />
        </>
    )
}
export default ProductListUser;