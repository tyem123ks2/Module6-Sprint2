import {useEffect, useState} from "react";
import {findAll} from "../service/product/ProductService";

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
            <Header />
            <div style={{ margin: "150px 0" }}>
                <div class="row mx-0 ">
                    <div class="event">
                        <div className="row mx-0 ps-5">
                            <div>
                                <h3
                                    style={{
                                        color: "#f26b38",
                                        fontSize: "24px",
                                        fontWeight: 600,
                                    }}
                                >
                                   FASHION LIST
                                </h3>
                            </div>
                        </div>
                        <div class="row mx-0 ps-5">
                            {products.map((product) => (
                                <div className="col-md-4 container" style={{ paddingTop: 20 }}>
                                    <div
                                        className="card"
                                        style={{ width: 400, backgroundColor: "rgb(0 0 0)" }}
                                    >
                                        <Link to={"/detail-discount/" + product.id}>
                                            <img
                                                style={{ height: 400 }}
                                                src={product.imageProduct}
                                                className="image"
                                            />
                                            <div className="readmore">
                                                <p style={{ color: "white" }}>
                                                    <b>{product.name}</b>
                                                </p>
                                                <div className="text" style={{ marginTop: 200 }}>
                                                    Chi tiết
                                                </div>
                                            </div>
                                        </Link>
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